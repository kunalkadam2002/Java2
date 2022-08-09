import java.util.*;
class p115{
  public static void main(String args[]){
    int a,n,sum;
    Scanner d1=new Scanner(System.in);
    System.out.println("enter any no :");
    n=d1.nextInt();
    int cnt=0;
    while(n!=0){
     a=n%10;
     n=n/10;
     cnt++;
  
    }
    System.out.println("no of digits are :"+cnt);
  }
}