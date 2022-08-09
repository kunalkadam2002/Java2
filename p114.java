import java.util.*;
class p114{
  public static void main(String args[]){
    int n,a,sum=0;
    Scanner d1=new Scanner(System.in);
    n=d1.nextInt();
    int x=n;
    while(n!=0){
     a=n%10;
     n=n/10;
     sum=sum+(a*a*a);
   }
   System.out.println("sum of cube of nos is :"+sum);
   if(sum==x){
   System.out.println("the no is armstrong no ");
   }else{
   System.out.println("the no is not armstrong no");
  }
 }
}