import java.util.*;
class p91{
  public static void main(String args[])
   throws Exception{
    char ch;
    
    System.out.println("enter any character :");
    ch=(char)System.in.read();
  
    if(ch>=97 && ch<=122){
     ch=(char)(ch-32);
     System.out.println("the characters capital alphabet : "+ch);
  }else if(ch>=65 && ch<=90){
     ch=(char)(ch+32);
    System.out.println("characters small alphabet :"+ch);
  }


  }




}