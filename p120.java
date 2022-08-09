import java.util.*;
class p120{
  public static void main(String args[]){
     int a,b,n,gcd=1;
    Scanner d1=new Scanner(System.in);
    a=d1.nextInt();
    b=d1.nextInt();
    n=2;
    
    while(n<=a){
     if(a%n==0 && b%n==0){
       gcd=n;
      }
       n++;
     
    
   }  
    System.out.println("GCD ="+gcd); 
  }





}