import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
         int n=scn.nextInt();
        int p=0,q=1;
        for(int i=1;i<=n;i++){
             for(int j=1;j<=i;j++){
                 System.out.print(p +"	");
                 int r=p+q;
                 p=q;
                 q=r;
             }
             System.out.println();
        }
        

    }
}