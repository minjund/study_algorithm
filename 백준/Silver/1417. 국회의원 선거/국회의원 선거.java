import java.util.*;
import java.util.Collections;
public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      int a = sc.nextInt();
      Integer[] c = new Integer[a-1];
      
      int dasomTic = 0;
      
      int cnt = 0;
      int max = 0;
      if(a == 1){
          System.out.print("0");
      }else{
          for(int i =0; i<a; i++){
            if(i==0){
                 dasomTic = sc.nextInt();
            }else{
                c[i-1] =   sc.nextInt(); 
            }
          }
          
          Arrays.sort(c, Comparator.reverseOrder());
          max = c[0];
          while(dasomTic <= max){
              c[0] = max-1;
              Arrays.sort(c, Comparator.reverseOrder()); 
              max = c[0];
              dasomTic++;
              cnt ++;
          }
          System.out.println(cnt);
      }
    }
}