import java.util.*;
class p119{
  public static void main(String args[]){
  int n,a;
  Scanner d1=new Scanner(System.in);
  n=d1.nextInt();
  int sum=0;
  a=1;
  while(a<n){
    if(n%a==0){
      sum=sum+a;
   }
     a++;

  }
   if(sum==n)
   System.out.println("the no is perfect no ");
   else 
    System.out.println("the no is not perfect no ");






}

}