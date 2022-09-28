import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        String sentence = sc.nextLine();
         String[] val = new String[sentence.length()];
        String a = sentence;
        
            for (int j = 0; j < sentence.length();j++) { 
                 val[j] = a;
                 a = a.substring(1);
            }
            Arrays.sort(val);
            
            for(String i : val){
                System.out.print(i+'\n');
            }
            
    }
}
