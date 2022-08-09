import java.util.*;
class p88{
   public static void main(String args[])
   throws Exception
    int n;
    char loc;
    float bill,rate;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the location r/u :");
    loc= (char)System.in.read();
    System.out.println("enter no of calls :");
    n=sc.nextInt();
    System.out.println("enter rate :");
    rate=sc.nextFloat();
    if(loc=='u' || loc=='U') {
      if(n>50){
       bill=(n-50)*rate;
      }else{
       bill=(n-100)*rate;
     }else if(loc=='r' || loc=='R'){
      if(n>100){
       bill=(n-100)*rate;
     }else 
        bill=0;
         System.out.println("bill amount :"+bill);
     
   }else 
         System.out.println("invalid location  :"); 
    
  }


}