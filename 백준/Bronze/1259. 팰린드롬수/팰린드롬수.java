import java.util.Scanner; 
import java.util.Stack;

public class Main { 
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    StringBuilder result = new StringBuilder();
    int sentence = 0;
    Stack stack = new Stack<>(); // 스택 객체 선언
   
   do{
        String res = "";
        sentence = sc.nextInt();

        if(sentence == 0){
           break;
        }
        int length = (int)(Math.log10(sentence)+1);
        for(int i=0; i < length; i++){
            stack.add(String.valueOf(sentence).charAt(i));
        }
        
        while (!stack.empty()) {
           res +=stack.pop();
        }
        boolean flag = false;
        for(int i=0; i < res.length(); i++){
            if(String.valueOf(sentence).charAt(i) == String.valueOf(res).charAt(i)){
                flag = true;
            }else{
               flag = false;
               break;
            }
        }
        if(flag){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        
   }while(sentence != 0);

}
}