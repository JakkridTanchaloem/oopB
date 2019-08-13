package chap4;
import java.util.Scanner;
public class Homework135_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type;
        System.out.println("----------------------Progarm Mailing service fee----------------------");
        
        System.out.print(" 0 : Exit\n 1 : Normal letter\n 2 : Register letter\n 3 : EMS letter\n");
        do {
        System.out.print("Please Enter Menu [0-3] : ");
        type = sc.nextInt();
        if(type == 0){
            System.out.println("Exit progarm");
            break;
        }
        System.out.print("\tInput Letter weight : ");
        int weight = sc.nextInt();
        
//        !!letter Normol
        if (type == 1 && weight <= 20){           
            System.out.println("\tNormal letter Service Price : 3 baht");
        }
        else if (type == 1 && weight <= 100){           
            System.out.println("\tNormal letter Service Price : 5 baht");
        }
        
        else if (type == 1 && weight <= 250){           
            System.out.println("\tNormal letter Service Price : 9 baht");
        }
        
        else if (type == 1 && weight <= 500){           
            System.out.println("\tNormal letter Service Price : 15 baht");
        }
        
        else if (type == 1 && weight <= 1000){           
            System.out.println("\tNormal letter Service Price : 25 baht");
        }
        
        else if (type == 1 && weight <= 2000){           
            System.out.println("\tNormal letter Service Price : 45 baht");
        }
        
//       !!letter Register
        else if (type == 2 && weight <= 20){           
            System.out.println("\tRegister letter Service Price : 5 baht");
        }
        else if (type == 2 && weight <= 100){           
            System.out.println("\tRegister letter Service Price : 15 baht");
        }
        
        else if (type == 2 && weight <= 250){           
            System.out.println("\tRegister letter Service Price : 22 baht");
        }
        
        else if (type == 2 && weight <= 500){           
            System.out.println("\tRegister letter Service Price : 28 baht");
        }
        
        else if (type == 2 && weight <= 1000){           
            System.out.println("\tRegister letter Service Price : 38 baht");
        }
        
        else if (type == 2 && weight <= 2000){           
            System.out.println("\tRegister letter Service Price : 58 baht");
        }
        
//        !! Letter EMS
        else if (type == 3 && weight <= 20){           
            System.out.println("\tEMS letter Service Price : 27 baht");
        }
        else if (type == 3 && weight <= 100){           
            System.out.println("\tEMS letter Service Price : 32 baht");
        }
        
        else if (type == 3 && weight <= 250){           
            System.out.println("\tEMS letter Service Price : 37 baht");
        }
        
        else if (type == 3 && weight <= 500){           
            System.out.println("\tEMS letter Service Price : 47 baht");
        }
        
        else if (type == 3 && weight <= 1000){           
            System.out.println("\tEMS letter Service Price : 62 baht");
        }
        
        else if (type == 3 && weight <= 2000){           
            System.out.println("\tEMS letter Service Price : 77 baht");
        }
        
        
          
        else {
            System.out.println("(!!Looks like the mail weight is over. Or you choose the wrong Menu)");
        }
        
        
        } while (type == 1 || type == 2 || type ==3);
        
        
        
                
                
            

        
        
}
}