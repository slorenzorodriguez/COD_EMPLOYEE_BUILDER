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
        
        //Instanciamos uno o varios objetos; en ellos, se establecen el o los valores obligatorios.
        EmployeeBuilder emp1 = new EmployeeBuilder("Pepe", 12123123);
        EmployeeBuilder emp2 = new EmployeeBuilder("Jesus", 32323232);
        
        //Con los Setters hechos en la clase Builder; establecemos al objeto creado los atriutos no obligatorios que queramos otorgarle.
        emp1.setMiddleName("Perez");
        emp1.setLastName("Alvarez");
        emp1.createEmployee();
        
        emp2.setMiddleName("Rodriguez");
        emp2.setLastName("Rodriguez");
        emp2.setBirthYear(1998);
        emp2.setBirthMonth(04);
        emp2.setBirthDate(13);
        emp2.createEmployee();
        
        //Mensaje a mostrar en consola con el objeto creado.
        System.out.println(emp1.createEmployee());
        System.out.println(emp2.createEmployee());
    }
    
}
