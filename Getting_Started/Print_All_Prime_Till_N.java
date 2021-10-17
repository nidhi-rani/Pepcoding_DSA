import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int low=s.nextInt();
        int high=s.nextInt();
        for(int i=low;i<=high;i++){
            if(isprime(i))
             System.out.println(i);
        }
    }
    public static boolean isprime(int n){
        int j=2;
        while(j*j<=n){
            if(n%j==0)
             break;
             j++;
        }
        if(j*j>n)
         return true;
        else
         return false;
    }
}