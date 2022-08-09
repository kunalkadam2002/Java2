import java.util.*;
class p112{
  public static void main(String args[]){
   int a,n,rev;
   rev=0;
   Scanner d1=new Scanner(System.in);
   System.out.println("enter any no :");
   n=d1.nextInt();
   
  while(n!=0){
    a=n%10;
    n=n/10;
    rev =rev*10+a;  
  }
   System.out.println("rev no is :"+rev);



  }






}