import java.util.*;
class p107{
 public static void main(String args[]){
  int n,i,fact;
   fact=1;
   i=1;
   Scanner d1=new Scanner(System.in);
    System.out.print("enter no :");
    n=d1.nextInt();
   
  while(i<=n){
    
     fact = fact*i;
    i++;  
 }
    System.out.print("the factorial is :"+fact);
 }








}