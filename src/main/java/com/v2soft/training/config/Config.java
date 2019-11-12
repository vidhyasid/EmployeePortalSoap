package com.v2soft.training.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;


@EnableWs
@Configuration
@PropertySource({ "classpath:application.properties" })
@ComponentScan({ "com.v2soft.training" })
@ImportResource({"classpath*:applicationContext.xml"})
public class Config extends WsConfigurerAdapter  {
	
	@Autowired
	private Environment env;
 
   @Bean
   public LocalSessionFactoryBean sessionFactory() {
      LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
      sessionFactory.setDataSource(restDataSource());
      sessionFactory.setPackagesToScan(
        new String[] { "com.v2soft.training" });
      sessionFactory.setHibernateProperties(hibernateProperties());
 
      return sessionFactory;
   }
 
   @Bean
   public DataSource restDataSource() {
      BasicDataSource dataSource = new BasicDataSource();
      dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
      dataSource.setUrl(env.getProperty("jdbc.url"));
      dataSource.setUsername(env.getProperty("jdbc.user"));
      dataSource.setPassword(env.getProperty("jdbc.pass"));
 
      return dataSource;
   }
 
   @Bean
   @Autowired
   public HibernateTransactionManager transactionManager(
     SessionFactory sessionFactory) {
  
      HibernateTransactionManager txManager = new HibernateTransactionManager();
      txManager.setSessionFactory(sessionFactory);
 
      return txManager;
   }
 
   @Bean
   public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
      return new PersistenceExceptionTranslationPostProcessor();
   }
 
   Properties hibernateProperties() {
      return new Properties() {
         {
            setProperty("hibernate.hbm2ddl.auto",
              env.getProperty("hibernate.hbm2ddl.auto"));
            setProperty("hibernate.dialect",
              env.getProperty("hibernate.dialect"));
            setProperty("hibernate.globally_quoted_identifiers",
             "true");
         }
      };
   }
	 @Bean
	    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) 
	    {
	        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
	        servlet.setApplicationContext(applicationContext);
	        servlet.setTransformWsdlLocations(true);
	        return new ServletRegistrationBean(servlet, "/service/*");
	    }
	 
	    @Bean(name = "employeeDetailsWsdl")
	    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema employeeSchema) 
	    {
	        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
	        wsdl11Definition.setPortTypeName("EmployeeDetailsPort");
	        wsdl11Definition.setLocationUri("/service/employee-details");
	        wsdl11Definition.setTargetNamespace("http://localhost:8080/types");
	        wsdl11Definition.setSchema(employeeSchema);
	        return wsdl11Definition;
	    }
	 
	    @Bean
	    public XsdSchema employeeSchema() 
	    {
	        return new SimpleXsdSchema(new ClassPathResource("employee.xsd"));
	    }

}
