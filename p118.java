import java.util.*;
 class p118{
  public static void main(String args[]){
    int c,n,a;
    Scanner d1=new Scanner(System.in);
    n=d1.nextInt();
    a=2;
   while(a<n){
     if(n%a==0){
        break;
     }
     a++;
   }
    if(a==n){
      System.out.println("the no is prime");
   
   }else{
      System.out.println("the no is not prime");
  }



  }



 }