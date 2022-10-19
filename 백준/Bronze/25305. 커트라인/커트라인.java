import java.util.*;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		int stu = in.nextInt();
		int cutLine = in.nextInt();

		int[] arr = new int[stu+1];
        for(int i =0; i < stu; i++){
            arr[i] = in.nextInt();
        }
        Integer[] score = Arrays.stream( arr ).boxed().toArray( Integer[]::new );
        
        	
        Arrays.sort(score, Collections.reverseOrder());

 		System.out.print(score[cutLine-1]);
	}
}