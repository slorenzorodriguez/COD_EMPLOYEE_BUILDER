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
public class ExamenEmployeeBuilderr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee emp1;
        Employee emp2;
        
        emp1 = new EmployeeBuilder("Pepe", 111222333).setBirthDate(23).setBirthMonth(11).setBirthYear(1998).createEmployee();

        emp2 = new EmployeeBuilder("Jesus", 222333444).setBirthDate(03).setBirthMonth(06).setBirthYear(2001).createEmployee();
        
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
    }
        
        
        
        
        
        
        

}
