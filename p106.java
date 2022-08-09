import java.util.*;
class p106{
   public static void main(String args[]){
    int i,n,sum;
    sum=0;
    i=1;
   Scanner d1= new Scanner(System.in);
   n=d1.nextInt();
  
  while(i<=n){
   System.out.print(""+i+"+");
   sum=sum+i;
   i++;

  }
   System.out.print("\b="+sum);
  



   }






}