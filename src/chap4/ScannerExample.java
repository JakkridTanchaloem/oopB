package chap4;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = sc.next();
        System.out.print("Input Age : ");
        int age = sc.nextInt();
        System.out.print("Input Salary : ");
        double salary = sc.nextDouble();
        System.out.print("Input Degree : ");
        int degree = sc.nextInt();
        
        System.out.println("Employyee for Athit :"+name);
        System.out.println("Age : "+age+", Salary : "+salary);
        
        if (age <= 11){
            System.out.println("วัยเด็ก");
        }
        else if (age<=20 ) {
            
            System.out.println("วัยรุ่น");
        } 
        
        else if (age<=40){
            System.out.println("วัยผู้ใหญ่");
        }
         else if (age<=60){
            System.out.println("วัยกลางคน");
        }
          else if (age<=65){
            System.out.println("วัยสูงอายุ");
        }
        else {
              System.out.println("อายุไม่ตรงเงื่อนไข");
            
        }
        
        switch (degree){
            case 1:
                 System.out.println("ปริญญาตรี");
                 break;
            case 2:
                 System.out.println("ปริญญาโท");
                 break;
            case 3:
                 System.out.println("ปริญญาเอก");
                 break;      
            default:
                System.out.println("ไม่ระบุ");
                break;
                 
                 
        }
         
    }
}
