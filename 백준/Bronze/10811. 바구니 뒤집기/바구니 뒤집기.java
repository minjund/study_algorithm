import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] arr = new int[N];
        
        for(int i = 1; i <= N; i++) {
         arr[i-1] = i;
        }
        
        for(int i = 0; i < M; i++) {
         int changeA = sc.nextInt() - 1;
         int changeB = sc.nextInt() - 1;
            while (changeA < changeB) {
    			int changeVal = arr[changeA];
    			arr[changeA++] = arr[changeB];
    			arr[changeB--] = changeVal;
    		}
        }
        for(int i = 0; i < N; i++) {
         System.out.print(arr[i]+" ");
        }
    }
}