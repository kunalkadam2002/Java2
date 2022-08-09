import java.util.*;
 class p128{
 public static void main(String args[]){
   int a,n,b,sum,no;
   Scanner d1=new Scanner(System.in);
   no=d1.nextInt();
   b=1;
   while(b<=no){
     n=b;
    sum=0;
    a=1;
      while(a<n){
       if(n%a==0)
        sum=sum+a;
        a++;

     }
    if(sum==n)
      System.out.println(n);
      b++;

   }

}









}