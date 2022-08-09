import java.util.*;
class p127{
   public static void main(String args[]){
    int no,a,b,n;
    Scanner d1=new Scanner(System.in);
    no=d1.nextInt();
    a=1;
    while(a<=no){
      n=a;
      b=2;
      while(b<=n){
        if(a%b==0){
        break;
        }
        b++;
      }
       if(b==n){
       System.out.println(n);
    }



      a++;
      }     


   }






}