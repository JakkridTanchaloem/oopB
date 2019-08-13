/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap3;

/**
 *
 * @author papercut
 */
public class CallEmployee {
    public static void main(String[] args) {
        //call static attr & method
        System.out.println("Id :"+Employee.id);
        Employee.work();
        
        //call non-static
        Employee em = new Employee();
        System.out.println("Name : "+em.name);
        System.out.println("Age  : "+em.age);
        em.getSalary();
    }    
}
