import java.util.*;
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Stack<Integer> st = new Stack<>();
	    long total = 0;
	    int N = sc.nextInt();
	    for(int i = 0; i < N; i++){
	        int str = sc.nextInt();
    	    while(!st.isEmpty() && st.peek() <= str){
                st.pop();
    	    }
    	    st.push(str);
    	    total += st.size()-1;
	    }
	    System.out.println(total);
	}
}