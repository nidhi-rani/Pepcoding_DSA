import java.util.*;
  
  class Main{
  
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int c=s.nextInt();
    int max=a>b?(a>c?a:c):(b>c?b:c);
    if(a==max){
        System.out.print(isTriplet(a,b,c));
    } 
    else if(b==max){
         System.out.print(isTriplet(b,a,c));
    }
    else{
     System.out.print(isTriplet(c,a,b));
    }
   }
   public static boolean isTriplet(int a,int b,int c){
       if(a*a==(b*b + c*c))
         return true;
        return false;
   }
  }