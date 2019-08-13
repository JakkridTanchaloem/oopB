package chap4;
import java.util.Scanner;
public class Homework135_1 {

   public static void main(String[] args) {
       
      System.out.println("---------------------------------Multiplication-------------------------------------------");
      System.out.println("1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t11\t12");
      System.out.println("------------------------------------------------------------------------------------------");

      int s;
      for (int i = 1; i <= 12; i++) {
          for(int k = 1; k <=12; k++) {
              s = (i)*(k) ;
              System.out.print(s+"\t");
          }
          System.out.println("");
      }

   }
}   
    

