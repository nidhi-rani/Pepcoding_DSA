import java.io.*;
import java.util.*;

class Main{

public static void main(String[] args) throws Exception {
      Scanner s=new Scanner(System.in);
    int r1=s.nextInt();
    int c1=s.nextInt();
    int [][]one=new int[r1][c1];
    for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){
            one[i][j]=s.nextInt();
        }
    }
    for(int j=0;j<one[0].length;j++){
        if(j%2==0){
            for(int i=0;i<one.length;i++){
                System.out.println(one[i][j]);
            }
        }else{
             for(int i=one.length-1;i>=0;i--){
                System.out.println(one[i][j]);
            }
        }
    }
 }

}