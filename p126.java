class p126{
   public static void main(String args[]){
     int a,n,b;
     b=1;
     while(b<=100){
       n=b;
       a=2;
        while(a<=n){
          if(n%a==0){
           break;
            }
           a++;
         }
       if(a==n){
        System.out.println(n); 
       }
      b++;
   }     
}
}