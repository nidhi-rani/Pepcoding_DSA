import java.io.*;
import java.util.*;

class Main{

public static void main(String[] args) throws Exception {
     Scanner s=new Scanner(System.in);
    int n1=s.nextInt();
    
    int []a1=new int[n1];
    
    for(int i=0;i<n1;i++){
        a1[i]=s.nextInt();
    }
    int n2=s.nextInt();
    int []a2=new int[n2];
    for(int i=0;i<n2;i++){
        a2[i]=s.nextInt();
    }
    int[] diff = new int[n2];
    int i = a1.length - 1;
    int j = a2.length - 1;
    int k = diff.length - 1;
    int b= 0;
    while (k>=0) {
      int d = a2[j]-b;

      if (i >= 0)
        d =d-a1[i];

      if (d< 0){
          d=d+10;
          b=1;
      }else{
          b=0;
      }
      diff[k]=d;
      i--;
      j--;
      k--;
    }
    int idx=0;
    while(idx<diff.length){
        if(diff[idx]!=0){
            break;
        }else{
            idx++;
        }
    }
    for(int l=idx;l<diff.length;l++){
        System.out.println(diff[l]);
    }
 }

}