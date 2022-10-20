import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int[] cnt = new int[]{1,1,2,2,2,8};
      for(int i = 0; i<cnt.length;i++){
          	int input = sc.nextInt();
          	if(input == cnt[i]){
          	    System.out.print(0+" ");
          	}else{
          	    System.out.print(cnt[i]-input+" ");
          	}
          	
      }
    }
}