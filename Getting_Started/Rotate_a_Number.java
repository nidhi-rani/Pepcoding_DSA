import java.util.*;
   
   class Main{
   
   public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int k=s.nextInt();
     int d=0;
     int t=n;
     int div=1;
     int mul=1;
     while(t!=0){
        t=t/10;
        d++;
     }
     k=k%d;
     if(k<0){
         k=k+d;
     }
     for(int i=1;i<=d;i++){
         if(i<=k)
           div=div*10;
          else
           mul=mul*10;
     }
     int q=n/div;
     int r=n%div;
     int v=r*mul+q;
     System.out.println(v);
     
     
    }
   }