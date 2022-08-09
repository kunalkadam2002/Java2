import java.util.*;
class p86{
  public static void main(String args[]){
   int n;
   float c=0,bill;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter no of units ");
  n=sc.nextInt();
  if(n>=1 && n<=100){
   c=1.00f;
   bill=n+c;
   System.out.println("the bill is :"+bill);
  }else if(n>=100 && n<=1000){
   c=1.50f;
   bill=n+c;
   System.out.println("the bill is :"+bill);
  }else if(n>=1000 && n<=10000){
   c=1.75f;
   bill=n+c;
   System.out.println("the bill is :"+bill);

  }


  }



}