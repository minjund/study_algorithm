import java.io.*;
import java.util.*;
public class Main {
 
    public static int comparison(String str, char ch) {
         int count = 0;     
         for (int i = 0; i < str.length(); i++) {     
             if (str.charAt(i) == ch) {        
                 count++;    
            }      
        }   
                 return count;  
    }
 
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        String input = br.readLine();
        System.out.print(comparison(input,'a')+" ");
        System.out.print(comparison(input,'b')+" ");
        System.out.print(comparison(input,'c')+" ");
        System.out.print(comparison(input,'d')+" ");
        System.out.print(comparison(input,'e')+" ");
        System.out.print(comparison(input,'f')+" ");
        System.out.print(comparison(input,'g')+" ");
        System.out.print(comparison(input,'h')+" ");
        System.out.print(comparison(input,'i')+" ");
        System.out.print(comparison(input,'j')+" ");
        System.out.print(comparison(input,'k')+" ");
        System.out.print(comparison(input,'l')+" ");
        System.out.print(comparison(input,'m')+" ");
        System.out.print(comparison(input,'n')+" ");
        System.out.print(comparison(input,'o')+" ");
        System.out.print(comparison(input,'p')+" ");
        System.out.print(comparison(input,'q')+" ");
        System.out.print(comparison(input,'r')+" ");
        System.out.print(comparison(input,'s')+" ");
        System.out.print(comparison(input,'t')+" ");
        System.out.print(comparison(input,'u')+" ");
        System.out.print(comparison(input,'v')+" ");
        System.out.print(comparison(input,'w')+" ");
        System.out.print(comparison(input,'x')+" ");
        System.out.print(comparison(input,'y')+" ");
        System.out.print(comparison(input,'z'));
                         
    }
 
}