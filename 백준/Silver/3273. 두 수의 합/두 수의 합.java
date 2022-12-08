import java.io.*;
import java.util.*;

public class Main {        
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   
        
		int N = Integer.parseInt(br.readLine());
        
		int[] arr = new int[N]; 
        
		StringTokenizer st = new StringTokenizer(br.readLine());        
		for(int i = 0; i < N; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
        
		int x = Integer.parseInt(br.readLine()); 
        
		Arrays.sort(arr);
        
		int start = 0;
		int end = N - 1;
		int sum = 0;
		int result = 0;
       
		while(start < end) {
			sum = arr[start] + arr[end];
			if(sum == x) result++;
            
			if(sum <= x) start++;
			else end--;
		}
        
		bw.write(result + "\n");
        
		bw.flush();
		br.close();
		bw.close();
	}
}