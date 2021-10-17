import java.util.*;
  
  class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
       int no=0;
       int mul=1;
       while(n!=0){
           int r=n%10;
           no=no+r*mul;
           mul=mul*b;
           n=n/10;
       }
       return no;
   }
  }