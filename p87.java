import java.util.*;
class p87{
  public static void main(String args[]){
   int n;
   float c=0,bill;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter no of units ");
  n=sc.nextInt();
  if(n>=1 && n<=100){
   bill=n*1.00f;
   System.out.println("the bill is :"+bill);
  }else if(n>=100 && n<=300){
   bill=100+(n-100)*1.50f;
   System.out.println("the bill is :"+bill);
  }else if(n>300){
    bill=100+300+(n-300)*1.75f;
    System.out.println("the bill is :"+bill);
  }


  }



}