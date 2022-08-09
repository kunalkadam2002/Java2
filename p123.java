class p123{
  public static void main(String args[]){
    int a,b,n,rev;
    b=225;
   while(b<=250){
     n=b;
     rev=0;
     while(n!=0){
       a=n%10;
       n=n/10;
       rev=rev*10+a;
     }
     System.out.println(+b+"\t"+rev);
     b++;

  
   }
 
 }


  






}