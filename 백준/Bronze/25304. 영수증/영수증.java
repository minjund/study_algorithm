import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
          Scanner sc = new Scanner(System.in);
 
        // Integer Type Input
        int allPrice = sc.nextInt();
        int allCnt = sc.nextInt();
        int all = 0;
        
        for (int i = 0; i < allCnt; i++) {
             int itemPrice = sc.nextInt();
              int itemCnt = sc.nextInt();
              all += itemPrice* itemCnt;
        }
        
        if(all == allPrice){
          System.out.print("Yes");
        }else{
          System.out.print("No");
        }
    }
}