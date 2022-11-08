import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      int a = sc.nextInt();
      int b = sc.nextInt();
      int[] c = new int[10001];
      int cnt = 0;
      int cnt2 = 1;
      int reslut = 0;
    
      while(cnt <= 1000){
         for(int i =0; i <cnt2; i++){
              c[cnt] = cnt2;
              cnt++;
          }
          cnt2++;
          
      }
      for(int j =a-1; j<b; j++){
          reslut +=c[j];
      }
      System.out.print(reslut);
    }
}