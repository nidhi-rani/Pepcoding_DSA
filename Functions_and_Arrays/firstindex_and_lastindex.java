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
    int first=binarySearch(arr,d,true);
    int last=binarySearch(arr,d,false);
    System.out.println(first);
    System.out.println(last);
   }
   public static int binarySearch(int []arr,int d,boolean first){
        int i=0;
        int j=arr.length-1;
        int index=-1;
        while(i<=j){
          int m=(i+j)/2;
          if(arr[m]<d){
            i=m+1;
          }else if(arr[m]>d){
            j=m-1;
          }else{
             index=m;
             if(first==true){
                 j=m-1;
             }else{
                 i=m+1;
             }
          }
        }
        return index;
    }
}