/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenemployeebuilderr;

/**
 *
 * @author slorenzorodriguez
 */
public class EmployeeBuilder {
    //Parámetros Establecemos los parámetros que nuestro objeto pueda tener. Los atributos obligatorios para el objeto deben ser final.
    private String lastName;
    private String middleName;
    private String firstName;
    private long id;
    private int birthYear;
    private int birthMonth;
    private int birthDate;
    private int hireYear;
    private int hireMonth;
    private int hireDate;

    public EmployeeBuilder(final String firstName, final long id) {
    }

    public EmployeeBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public EmployeeBuilder setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public EmployeeBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public EmployeeBuilder setId(long id) {
        this.id = id;
        return this;
    }

    public EmployeeBuilder setBirthYear(int birthYear) {
        this.birthYear = birthYear;
        return this;
    }

    public EmployeeBuilder setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
        return this;
    }

    public EmployeeBuilder setBirthDate(int birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public EmployeeBuilder setHireYear(int hireYear) {
        this.hireYear = hireYear;
        return this;
    }

    public EmployeeBuilder setHireMonth(int hireMonth) {
        this.hireMonth = hireMonth;
        return this;
    }

    public EmployeeBuilder setHireDate(int hireDate) {
        this.hireDate = hireDate;
        return this;
    }

    public Employee createEmployee() {
        return new Employee(lastName, middleName, firstName, id, birthYear, birthMonth, birthDate, hireYear, hireMonth, hireDate);
    }
}
