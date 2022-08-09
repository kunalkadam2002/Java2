import java.util.*;
class p117{
  public static void main(String args[]){
    int n,a,rev=0;
    Scanner d1 =new Scanner(System.in);
    n=d1.nextInt();
    while(n!=0){
    a=n%10;
    n=n/10;
    rev=rev*10+a;  
   }
   n=rev;
   
  String s1[]={"\tzero","\tone","\t two","\tthree","\t four","\t five","\t six","\t seven","\t eight","\t nine"};
  while(n!=0){
     a=n%10;
     System.out.print(s1[a]);
     n=n/10;
   }
 }








}