//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.11 at 09:21:49 PM EST 
//


package com.v2soft.training.server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the localhost._8080.types package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetEmployeeRequest_QNAME = new QName("http://localhost:8080/types", "GetEmployeeRequest");
    private final static QName _UpdateEmployeeSalaryResponse_QNAME = new QName("http://localhost:8080/types", "UpdateEmployeeSalaryResponse");
    private final static QName _GetEmployeeAccountResponse_QNAME = new QName("http://localhost:8080/types", "GetEmployeeAccountResponse");
    private final static QName _CreateEmployeeResponse_QNAME = new QName("http://localhost:8080/types", "CreateEmployeeResponse");
    private final static QName _UpdateEmployeeSalaryRequest_QNAME = new QName("http://localhost:8080/types", "UpdateEmployeeSalaryRequest");
    private final static QName _GetEmployeeHrResponse_QNAME = new QName("http://localhost:8080/types", "GetEmployeeHrResponse");
    private final static QName _CreateEmployeeRequest_QNAME = new QName("http://localhost:8080/types", "CreateEmployeeRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: localhost._8080.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmployeeWithoutSalary }
     * 
     */
    public EmployeeWithoutSalary createEmployeeWithoutSalary() {
        return new EmployeeWithoutSalary();
    }

    /**
     * Create an instance of {@link UpdateEmployeeSalaryRequestWithSecurity }
     * 
     */
    public UpdateEmployeeSalaryRequestWithSecurity createUpdateEmployeeSalaryRequestWithSecurity() {
        return new UpdateEmployeeSalaryRequestWithSecurity();
    }

    /**
     * Create an instance of {@link CreateEmployeeRequestWithSecurity }
     * 
     */
    public CreateEmployeeRequestWithSecurity createCreateEmployeeRequestWithSecurity() {
        return new CreateEmployeeRequestWithSecurity();
    }

    /**
     * Create an instance of {@link GetEmployeeRequestWithSecurity }
     * 
     */
    public GetEmployeeRequestWithSecurity createGetEmployeeRequestWithSecurity() {
        return new GetEmployeeRequestWithSecurity();
    }

    /**
     * Create an instance of {@link EmployeeWithSalary }
     * 
     */
    public EmployeeWithSalary createEmployeeWithSalary() {
        return new EmployeeWithSalary();
    }

    /**
     * Create an instance of {@link SecurityInformation }
     * 
     */
    public SecurityInformation createSecurityInformation() {
        return new SecurityInformation();
    }

    /**
     * Create an instance of {@link FileAttachment }
     * 
     */
    public FileAttachment createFileAttachment() {
        return new FileAttachment();
    }

    /**
     * Create an instance of {@link SalaryDetails }
     * 
     */
    public SalaryDetails createSalaryDetails() {
        return new SalaryDetails();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeRequestWithSecurity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:8080/types", name = "GetEmployeeRequest")
    public JAXBElement<GetEmployeeRequestWithSecurity> createGetEmployeeRequest(GetEmployeeRequestWithSecurity value) {
        return new JAXBElement<GetEmployeeRequestWithSecurity>(_GetEmployeeRequest_QNAME, GetEmployeeRequestWithSecurity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeWithSalary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:8080/types", name = "UpdateEmployeeSalaryResponse")
    public JAXBElement<EmployeeWithSalary> createUpdateEmployeeSalaryResponse(EmployeeWithSalary value) {
        return new JAXBElement<EmployeeWithSalary>(_UpdateEmployeeSalaryResponse_QNAME, EmployeeWithSalary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeWithSalary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:8080/types", name = "GetEmployeeAccountResponse")
    public JAXBElement<EmployeeWithSalary> createGetEmployeeAccountResponse(EmployeeWithSalary value) {
        return new JAXBElement<EmployeeWithSalary>(_GetEmployeeAccountResponse_QNAME, EmployeeWithSalary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeWithoutSalary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:8080/types", name = "CreateEmployeeResponse")
    public JAXBElement<EmployeeWithoutSalary> createCreateEmployeeResponse(EmployeeWithoutSalary value) {
        return new JAXBElement<EmployeeWithoutSalary>(_CreateEmployeeResponse_QNAME, EmployeeWithoutSalary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEmployeeSalaryRequestWithSecurity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:8080/types", name = "UpdateEmployeeSalaryRequest")
    public JAXBElement<UpdateEmployeeSalaryRequestWithSecurity> createUpdateEmployeeSalaryRequest(UpdateEmployeeSalaryRequestWithSecurity value) {
        return new JAXBElement<UpdateEmployeeSalaryRequestWithSecurity>(_UpdateEmployeeSalaryRequest_QNAME, UpdateEmployeeSalaryRequestWithSecurity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeWithoutSalary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:8080/types", name = "GetEmployeeHrResponse")
    public JAXBElement<EmployeeWithoutSalary> createGetEmployeeHrResponse(EmployeeWithoutSalary value) {
        return new JAXBElement<EmployeeWithoutSalary>(_GetEmployeeHrResponse_QNAME, EmployeeWithoutSalary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEmployeeRequestWithSecurity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:8080/types", name = "CreateEmployeeRequest")
    public JAXBElement<CreateEmployeeRequestWithSecurity> createCreateEmployeeRequest(CreateEmployeeRequestWithSecurity value) {
        return new JAXBElement<CreateEmployeeRequestWithSecurity>(_CreateEmployeeRequest_QNAME, CreateEmployeeRequestWithSecurity.class, null, value);
    }

}
