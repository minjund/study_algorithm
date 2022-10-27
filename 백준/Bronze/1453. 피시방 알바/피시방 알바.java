import java.util.*;

public class Main {// 1453번 피씨방 알바
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean[] arr = new boolean[101];

		int backCount = 0;

		for (int i = 0; i < num; i++) {
			int request = sc.nextInt();
			if (arr[request] == true) {
				backCount++;
			} else {
				arr[request] = true;
			}

		}

		System.out.println(backCount);
	}

}