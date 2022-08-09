import java.util.*;
class p109{
  public static void main(String args[]){
   int x,n,i,pow;
    Scanner d1=new Scanner(System.in);
     System.out.print("enter the nos :");
     x=d1.nextInt();
     n=d1.nextInt();
    pow=1;
     i=1;
     while(i<=n){
      pow=pow*x;
      i++;

    } 
      System.out.print("Result :"+pow);
    



 
  
  }







}