class p125{
  public static void main(String args[]){
    int a,n,b,sum,m;
    a=1;
    while(a<=1000){
       n=a;
       sum=0;
       m=a;
      while(n!=0){
        b=n%10;
        n=n/10;
        sum=sum+b*b*b;
       }
       if(sum==m){
         System.out.println(+sum);
      }
      a++;
       

  
   
   }


  

  }




}