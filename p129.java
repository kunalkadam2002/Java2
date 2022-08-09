import java.util.*;
class p129{
   public static void main(String args[]){
     int a,b,n;
     Scanner d1=new Scanner(System.in);
     System.out.print("enter 1st no :");
     a=d1.nextInt();
    System.out.print("enter 2nd no :");
     b=d1.nextInt();
      while(true){
      System.out.println("1.Addition\n 2.Substraction \n 3.Multiplication \n 4.Division \n  5.EXIT ");
       System.out.print("enter ur choice :");
       n=d1.nextInt();
       switch(n){
         case 1:
          n=a+b;
           System.out.println("addition is :"+n);
           break;

        case 2:
          n=a-b;
           System.out.print("sub is :"+n);
           break;
       
        case 3:
          n=a*b;
           System.out.print("mul is :"+n);
           break;

       case 4:
          n=a/b;
           System.out.print("div is :"+n);
           break;
   
       case 5:
           System.exit(0);
           break;
 
        default:
   
           System.out.print("enter a valid choice ");
           break;

     }
         

    
     }

  

  }









}