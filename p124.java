class p124{
  public static void main(String args[]){
   int x,n,y,rev,m;
   x=200;
   
   while(x<=300){
     n=x;
     m=x;
     rev=0;
     while(n!=0){
       y=n%10;
       n=n/10;
       rev=rev*10+y;  
     }
     if(m==rev)
       System.out.println(""+rev);
     x++;   
   }
 }
}