import java.util.*;

class Main{

public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   int i=0;
   int x=1;
   while(n!=0){
     int r=n%10;
     i=i+(x*(int)Math.pow(10,r-1));
     n=n/10;
     x++;
   }
   System.out.println(i);
 }
}