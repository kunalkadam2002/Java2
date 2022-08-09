import java.util.*;
  class p84{
   public static void main(String args[]){
     int n;
     Scanner d1=new Scanner(System.in);
     System.out.println("enter any no :");
     n=d1.nextInt();
     if(n>=1 && n<=9 || n<=-1 && n >=-9 ){
       System.out.println("the no is 1 digit ");
    }else if(n>=10 && n<=99 || n<=-10 && n >=-99 ){
       System.out.println("the no is 2 digit ");
    } if(n>=100 && n<=999|| n<=-100 && n >=-999 ){
       System.out.println("the no is 3 digit ");
    }else if(n>=1000 && n<=9999 || n<=-1000 && n>=-9999){
       System.out.println("the no is large ");
   }




   }




}