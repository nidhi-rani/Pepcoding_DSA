import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      int tn1=n1;
      int tn2=n2;
      while(tn1%tn2!=0){
          int r=tn1%tn2;
          tn1=tn2;
          tn2=r;
      }
      int gcd=tn2;
      int lcm=(n1*n2)/gcd;
      System.out.println(gcd);
      System.out.println(lcm);
     }
    }