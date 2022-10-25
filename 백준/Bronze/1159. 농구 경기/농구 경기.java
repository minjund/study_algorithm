import java.util.Scanner; 
import java.util.*;

public class Main { 
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    StringBuilder result = new StringBuilder();
    int scann = sc.nextInt();
    //String[] s = new String[scann];
    String s = "";
    String c = "";
    
    if(scann < 5){
        System.out.print("PREDAJA");
    }else{
        for(int i =0; i < scann; i++){
            String member = sc.next();
            String memberFirst = String.valueOf(member.charAt(0));
            
            s += memberFirst;
        }
        //Arrays.sort(s);
        for(int i=0; i< s.length(); i++){
                int count = s.length() - s.replace(String.valueOf(s.charAt(i)), "").length();
                if(c =="" && count >= 5){
                    c = String.valueOf(s.charAt(i));
                }
                if(count >= 5 && !c.contains(String.valueOf(s.charAt(i)))) {
                   c  += String.valueOf(s.charAt(i)) ;
                }
        }
        
        char[] chars = c.toCharArray();
        Arrays.sort(chars);
        String hc = new String(chars);
        
        if(c != ""){
             System.out.println(hc);
        }else{
            System.out.print("PREDAJA");
        }
     
    }
 }
}