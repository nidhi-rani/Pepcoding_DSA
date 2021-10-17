import java.util.*;
  
  class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       int no=0;
       int mul=1;
       while(n!=0){
           int r=n%b;
           no=no+r*mul;
           mul=mul*10;
           n=n/b;
       }
       return no;
   }
  }