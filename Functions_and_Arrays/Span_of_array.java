import java.io.*;
import java.util.*;

class Main{

public static void main(String[] args) throws Exception {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
        a[i]=s.nextInt();
    }
    int max=a[0];
    int min=a[0];
    for(int i=1;i<n;i++){
        if(a[i]>max)
          max=a[i];
        if(a[i]<min)
          min=a[i];
    }
    System.out.println(max-min);
 }

}