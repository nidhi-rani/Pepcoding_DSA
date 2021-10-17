import java.io.*;
import java.util.*;

class Main{

public static void main(String[] args) throws Exception {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int []arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
    }
    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            for(int k=i;k<=j;k++){
                System.out.print(arr[k]+"	");
            }
            System.out.println();
        }
    }
 }

}