import java.util.*;
class p92{
  public static void main(String args[])
   throws Exception{
    char ch;
    System.out.println("enter any character :");
    ch=(char)System.in.read();
    if(ch>=97 && ch<=122){
     System.out.println("its a small alphabet ");
  }else if(ch>=65 && ch<=90){
    System.out.println("its a capital alphabet");
  }else if(ch>=48 && ch<=57){
     System.out.println("its a number ");
  }else{
     System.out.println("its a symbol");
  }


  }




}