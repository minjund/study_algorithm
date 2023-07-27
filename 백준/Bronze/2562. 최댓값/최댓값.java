import java.util.*;
public class Main {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
        
		int N = 0,max=0;
		Integer[] arr = new Integer[9];
		int count = 0;
		
		for (int i = 0; i < 9; i++) {
		    N = in.nextInt();
		    arr[i] = N;
		}
		
		for (int i = 0; i < 9; i++) {
		    if(arr[i] >= max){
		        max = arr[i];
		    }
		}
		System.out.println(max);
		System.out.print(Arrays.asList(arr).indexOf(max)+1); 
		
	}
}