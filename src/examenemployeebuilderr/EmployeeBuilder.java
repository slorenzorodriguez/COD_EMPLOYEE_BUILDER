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
   private final String firstName;
   private final long id;
   private int birthYear;
   private int birthMonth;
   private int birthDate;
   private int hireYear;
   private int hireMonth;
   private int hireDate;

   // Constructor con los atributos obligatorios.
    public EmployeeBuilder(final String firstName, final long id) {
        this.firstName = firstName;
        this.id = id;
    }
  // Getters/Setters de los demás atributos para obtener los datos. 
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public int getHireMonth() {
        return hireMonth;
    }

    public void setHireMonth(int hireMonth) {
        this.hireMonth = hireMonth;
    }

    public int getHireDate() {
        return hireDate;
    }

    public void setHireDate(int hireDate) {
        this.hireDate = hireDate;
    }
    
    //CreateEmployee estableciendo qué devolverá el objeto creado, en este caso devolverá todos los atributos se haya establecido o no valor para ellos. 
    public Employee createEmployee(){
        return new Employee (lastName, middleName,firstName,id,birthYear,birthMonth,birthDate,hireYear,hireMonth,hireDate);
    }
   
   
}
