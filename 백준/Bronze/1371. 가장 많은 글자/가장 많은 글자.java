import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int[] count = new int[26];
        while(true){
            try{
                String input = sc.next(); 
                for (int i = 0; i < input.length(); i++) {
                    count[(int) input.charAt(i) - 97] += 1;
                }
            }catch(Exception e){
                break;
            }
    }
    
            String reslut = "";  
            int max = count[0];
            for (int i = 0; i < count.length; i++) {
               if (count[i] >= max) {     
                   max = count[i];       
                }
            }
            
            for (int i = 0; i < count.length; i++) {
               if (count[i] == max) {      
                    char c=(char)(i+97);
                    System.out.print(c);
                }
            }
    }
}