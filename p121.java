import java.util.*;
class p121{
  public static void main(String args[]){
   int a,b,n,lcd=1;
   Scanner d1=new Scanner(System.in);
   a=d1.nextInt();
   b=d1.nextInt();
   n=a;
   while(n>1){
    if(a%n==0 && b%n==0){
      lcd=n;
    } 
     n--;
     

   } 
    System.out.println("LCD ="+lcd);


  }







}