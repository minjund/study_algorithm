import java.util.*;
public class Main{
    
    static int recursionCnt = 0;
    
    public static int recursion(String s, int l, int r){
        recursionCnt++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else {
            return recursion(s, l+1, r-1);
            
        }
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int totalInput = in.nextInt();
        
        int reslut  = 0;
         
        for(int i =0; i < totalInput; i++){
            String str = in.next();
            reslut = isPalindrome(str);
            System.out.print(reslut+" ");
            System.out.println(recursionCnt);
            recursionCnt = 0;
        }
    }
}