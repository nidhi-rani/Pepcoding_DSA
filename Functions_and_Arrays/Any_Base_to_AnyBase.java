import java.util.*;
  
  class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int ans=anyBase(n,sourceBase,destBase);
     System.out.println(ans);
   }   
   public static int anyBase(int n,int s,int d){
       int dec=toDecimal(n,s);
       int dest=toDest(dec,d);
       return dest;
       
   }
   public static int toDecimal(int n,int s){
       int no=0;
       int mul=1;
       while(n!=0){
           int r=n%10;
           no=no+r*mul;
           mul=mul*s;
           n=n/10;
       }
       return no;
   }
   public static int toDest(int n,int d){
       int no=0;
       int mul=1;
       while(n!=0){
           int r=n%d;
           no=no+r*mul;
           mul=mul*10;
           n=n/d;
           
       }
       return no;
   }
  }