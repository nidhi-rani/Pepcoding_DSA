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
    int d=s.nextInt();
    int i=0;
    int j=arr.length-1;
    int m=-1;
    boolean b=false;
    while(i<=j){
        m=(i+j)/2;
        if(arr[m]<d){
            i=m+1;
        }else if(arr[m]>d){
            j=m-1;
        }else{
            b=true;
        }
     }
     if(b){
         System.out.println(arr[m]);
         System.out.println(arr[m]);
     }else{
         System.out.println(arr[i]);
         System.out.println(arr[j]); 
     }
 }

}