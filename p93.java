import java.util.*;
class p93{
  public static void main(String args[]){
   int a,b,c,d,e,f,tot;
   float per;
   
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
  System.out.println("total :"+tot);
   int fcnt=0;
  if(a<40)
    fcnt++;
   if(b<40)
    fcnt++;
   if(c<40)
    fcnt++;
   if(d<40)
    fcnt++;
   if(e<40)
    fcnt++;
   if(f<40)
    fcnt++;
   if(fcnt==0){
    System.out.println("Pass");
    if(per<50)
    System.out.println("Pass class");
   else if(per<75)
    System.out.println("2nd class");
  else if(per<90)
    System.out.println("1st class");
  else
    System.out.println("Distinction");
  }
  else if(fcnt==3)
    System.out.println("ATKT");
 else 
    System.out.println("Fail");
  }
}
   
  