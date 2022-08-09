import java.util.*;
class p89{
  public static void main(String args[]){
   int a,b,c,d,e,f,tot;
   float per;
   char grade;
   Scanner d1=new Scanner(System.in);
   System.out.println("enter marks of sub :");
   a=d1.nextInt();
   b=d1.nextInt();
   c=d1.nextInt();
   d=d1.nextInt();
   e=d1.nextInt();
   f=d1.nextInt();
   tot=a+b+c+d+e+f;
   per=tot/6;
   System.out.println("per :"+per);
   if(per<50){
    System.out.println("pass");
  }else if(per>=50 && per <75){
    System.out.println("2nd class");
  }else if(per >=75 && per<90){
    System.out.println("1st class");
  }else if(per >=90){
    System.out.println("distinction");
   }





  }


}