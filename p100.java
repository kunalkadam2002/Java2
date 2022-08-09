import java.util.*;
class p100{
   public static void main(String args[]){
     float a,b,c;
     int n;
    Scanner d1= new Scanner(System.in);
    System.out.println("enter 2 nos :");
    a=d1.nextFloat();
    b=d1.nextFloat();
    System.out.println("---------------------");
    System.out.println("1.Addition\n 2.Multiplication \n 3.Division \n 4.Substraction \n 5.Exit  ");
    System.out.println("---------------------");
    System.out.println("enter your choice ");  
    n=d1.nextInt();
  
   switch(n){
     case 1 :
       c= a+b;
       System.out.println("Addition is :"+c);
       break;
  
    case 2 :
       c= a*b;
       System.out.println("Multiplication is :"+c);
       break;
 
   case 3 :
       c= a/b;
       System.out.println("Division is :"+c);
       break;
  
  case 4 :
       c= a-b;
       System.out.println("Substraction is :"+c);
       break;
 
  case 5 :
       System.exit(0);
  
  default :
    
       System.out.println("wrong choice ");
 


   System.out.println("---------------------");
       

   
  




 
 
  }
   

    



 

   }












}