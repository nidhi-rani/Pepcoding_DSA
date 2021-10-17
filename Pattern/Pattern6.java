import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
       int nspaces = 1;
        int nstars = n/2+1;
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= nstars; j++) {
                System.out.print("*	");
            }

            for (int j = 1; j <= nspaces; j++) {
                System.out.print("	");
            }
            for (int j = 1; j <= nstars; j++) {
                System.out.print("*	");
            }

            if (i <= n / 2) {
                nspaces+=2;
                nstars--;
            } else {
                nspaces-=2;
                nstars++;
            }


            System.out.println();
        }

    }
}