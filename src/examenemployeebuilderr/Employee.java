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
public class Employee {
       //Establecemos atributos que el objeto a crear pueda tener; no se diferencian los atributos obligatorios del resto. 
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

   //Creamos un constructor con todos los parámetros de la clase. 
   public Employee(
      final String newLastName,
      final String newMiddleName,
      final String newFirstName,
      final long newId,
      final int newBirthYear,
      final int newBirthMonth,
      final int newBirthDate,
      final int newHireYear,
      final int newHireMonth,
      final int newHireDate)
   {
      this.lastName = newLastName;
      this.middleName = newMiddleName;
      this.firstName = newFirstName;
      this.id = newId;
      this.birthYear = newBirthYear;
      this.birthMonth = newBirthMonth;
      this.birthDate = newBirthDate;
      this.hireYear = newHireYear;
      this.hireMonth = newHireMonth;
      this.hireDate = newHireDate;
   }

   //Creamos el toString el cual será lo que nos devuelva el objeto que creamos.
    @Override
    public String toString() {
        return "Employee: " + "Last Name = " + lastName + ", Middle Name = "  + middleName + ", First Name = "  + firstName + ", ID = " + id + ", Birth Year = " + birthYear + ", Birth Month = " + birthMonth + ", Birth Date = " + birthDate + ", Hire Year = " + hireYear + ", Hire Month = " + hireMonth + ", Hire Date = " + hireDate;
    }
   
   
   
}

