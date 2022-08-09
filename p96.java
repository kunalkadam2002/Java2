import java.util.*;
class p96{
  public static void main(String args[]){
    int n;
    Scanner d1=new Scanner(System.in);
    n=d1.nextInt();
    switch(n%2){
      case 0:
       System.out.println("the no is even");      
       break;

     case 1:
      System.out.println("the no is odd");     
      break;
   
     default:
        System.out.println("enter no only");     

   }


  }



}