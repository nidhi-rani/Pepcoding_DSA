import java.io.*;
import java.util.*;
import java.util.*;
 class Main{

public static void main(String[] args) throws Exception {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    
    int[]a=new int[n];
    for(int i=0;i<n;i++){
        a[i]=s.nextInt();
    }
    int d=s.nextInt();
    int j=-1;
    for(int i=0;i<n;i++){
        if(d==a[i]){
          j=i; 
        }
          
    }
   System.out.println(j);
 }

}