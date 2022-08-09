import java.util.*;
class p83{
  public static void main(String args[]){
    int a,b,c,d,e;
    Scanner d1=new Scanner(System.in);
    System.out.println("enter 5 nos :");
    a=d1.nextInt();
    b=d1.nextInt();
    c=d1.nextInt();
    d=d1.nextInt();
    e=d1.nextInt();
    if(a==b && b==c && c==d && d==e){
    System.out.println("all nos are equal");
 
   }else if(a<=b && a<=c && a<=d && a<=e ){
    System.out.println("the min no is "+a);

   }else if(b<=a && b<=c && b<=d && b<=e){
    System.out.println("the min no is "+b);

   }else if(c<=a && c<=b && c<=d && c<=e){
    System.out.println("the min no is "+c);

   }else if(d<=a && d<=b && d<=c && d<=e){
    System.out.println("the min no is "+d);

   }else if(e<=a && e<=b && e<=c && e<=d){
    System.out.println("the min no is "+e);
   }
     
   }
}