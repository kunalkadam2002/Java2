import java.util.*;
class p85{
 public static void main(String args[]){
  int bp,sp,p;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter buying price :");
   bp=sc.nextInt();
   System.out.println("enter selling price :");
   sp=sc.nextInt();
  
  if(bp>sp){
    p=bp-sp;
    System.out.println("Profit is :"+p);
  }else if(sp>bp){
    p=sp-bp;
    System.out.println("Profit is :"+p);
 }else if(sp==bp){
    p=sp-bp;
   System.out.println("Profit is :"+p);
}
   

 }



}