class p98{
  public static void main(String args[])
   throws Exception{
   char ch;
   System.out.println("enter any character");
   ch=(char)System.in.read();
 
  switch(ch){
   case 'm' :
   case 'M' :
     System.out.println("Monday");
     break;
  
  case 't':
      System.out.println("Tuesday");
      break;

  case 'w' :
  case 'W' :
       System.out.println("Wednesday");
       break;
  
  case 'T' :
       System.out.println("Thursday");
       break;

  case 'f'  :
  case 'F' :
       System.out.println("Friday");
       break;
 
  case 's' :
       System.out.println("Saturday");
       break;
 
  case 'S':
       System.out.println("Sunday");
       break;
  
  default :
      System.out.println("not a day ");
    }  
  }

}