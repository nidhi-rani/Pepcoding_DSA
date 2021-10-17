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
    int lim=(1<<n);
    for(int i=0;i<lim;i++){
        int dec=i;
        String str="";
        for(int j=0;j<arr.length;j++){
            int r=dec%2;
            dec=dec/2;
            if(r==0){
               str="-	"+str; 
            }else{
                str=arr[arr.length-1-j]+"	"+str;
            }
        }
        System.out.println(str);
    }
    
 }

}