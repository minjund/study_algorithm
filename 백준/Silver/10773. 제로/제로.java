import java.util.*;
public class Main {
	public static void main(String[] args) {
	    
		Scanner in = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		int N = in.nextInt();
        int total = 0;
		
		for(int i = 0; i < N; i++) {
			int str = in.nextInt();
			if(str == 0){
                stack.pop();
            }else{
			    stack.push(str);
            }
		}
		
		while(!stack.empty()){
		     total += stack.pop();
		}
		
		System.out.println(total);
	}
}