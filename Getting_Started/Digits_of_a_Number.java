import java.util.*;
    
    class Main{
    
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int pow=1;
      int temp=n;
      while(temp>=10){
          temp=temp/10;
          pow=pow*10;
     }
     temp=n;
     while(pow!=0){
         int digit=temp/pow;
         System.out.println(digit);
         temp=temp%pow;
         pow=pow/10;
     }
    }
    }