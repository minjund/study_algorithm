import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      String n = sc.next();
      String m = sc.next();
      int a =0;
       int b =0;
      long reslut = 0;
      for(int i=0; i<n.length(); i++){
          a = n.charAt(i)-'0';
          for(int j=0;j<m.length();j++){
              b = m.charAt(j)-'0';
              
              reslut += a *  b;
          }
      }
      System.out.println(reslut);
    }
}