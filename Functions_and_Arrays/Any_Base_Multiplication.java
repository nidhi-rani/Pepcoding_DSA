import java.util.*;

class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }

 public static int getProduct(int b, int n1, int n2){
     int res=0;
     int tp=1;
     while(n2>0){
        int d=n2%10;
        n2=n2/10;
        int val=prowithsingledigit(b,n1,d);
        res=getSum(b,res,val*tp);
        tp=tp*10;
     }
     return res;
  }
 public static int getSum(int b, int n1, int n2){
       int c=0;
       int ans=0;
       int mul=1;
       while(n1!=0 || n2!=0 || c!=0){
           int s=n1%10 +n2%10 +c;
           c=s/b;
           ans=ans+(s%b)*mul;
           mul=mul*10;
           n1=n1/10;
           n2=n2/10;
       }
       return ans;
   }
 public static int prowithsingledigit(int b,int n1,int d){
     int res=0;
     int tp=1;
     int c=0;
     while(n1>0 || c>0){
         int d1=n1%10;
         n1=n1/10;
         int p=d1*d+c;
         int r=p%b;
         res=res+r*tp;
         c=p/b;
         tp=tp*10;
     }
     return res;
 }
 
}