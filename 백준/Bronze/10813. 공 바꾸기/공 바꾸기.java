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
        
        int changeVal = 0;
        for(int i = 0; i < M; i++) {
         int changeA = sc.nextInt();
         int changeB = sc.nextInt();
         changeVal = arr[changeA-1];
         arr[changeA-1] = arr[changeB-1];
         arr[changeB-1] = changeVal;
        }
        for(int i = 0; i < N; i++) {
         System.out.print(arr[i]+" ");
        }
    }
}