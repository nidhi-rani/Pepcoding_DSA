import java.util.*;

class Main{

public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   for(int i=2;i*i<=n;i++){
       for(;n%i==0;n=n/i)
        System.out.print(i+" ");
   }
   if(n>1)
      System.out.println(n);//special case ,if n is 46
 }
}