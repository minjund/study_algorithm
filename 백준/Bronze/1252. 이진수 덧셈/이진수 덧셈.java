import java.util.*;
import java.math.BigInteger;
public class Main {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       String a = sc.next();
       String b = sc.next();
        
       BigInteger a10 = new BigInteger(a, 2);
       BigInteger b10 = new BigInteger(b, 2);
      
       BigInteger c = a10.add(b10);
       String binaryString = c.toString(2);
      System.out.print(binaryString);
    }
}