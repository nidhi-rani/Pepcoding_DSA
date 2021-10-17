import java.util.*;
  
 class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      
      int t=scn.nextInt();
      int[]a=new int[t];
      for(int i=0;i<t;i++)
          a[i]=scn.nextInt();
       for(int i=0;i<a.length;i++){
         boolean b=isprime(a[i]);
         if(b==true)
          System.out.println("prime");
         else
          System.out.println("not prime");
       }  
  
   }
   public static boolean isprime(int no){
       int c=0;
       for(int j=2;j<=(no/2);j++){
               c=0;
              if(no%j==0){
                  c++;
                  break;
              }}
          if(c==0)
           return true;
          else
          return false;
      }
   
  }