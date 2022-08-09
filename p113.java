import java.util.*;
class p113{
  public static void main(String args[]){
   int n,rev,a;
   rev=0;
   Scanner d1=new Scanner(System.in);
   System.out.println("enter any no :");
    n=d1.nextInt();
    int x=n;
   while(n!=0){
     a=n%10;
     n=n/10;
     rev=rev*10 + a;
    }
    if(rev==x){
    System.out.println("the no is palindrome");
   }else {
    System.out.println("the no is not palindrome");
  }

 }





}