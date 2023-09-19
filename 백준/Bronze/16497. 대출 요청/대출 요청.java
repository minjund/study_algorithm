import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int countFor = Integer.parseInt(st.nextToken());
        int rentalCnt = 0;
        int[] dateArr = new int[32];
        for(int i =0; i < countFor; i++) {
            st = new StringTokenizer(bf.readLine());
            int startRental = Integer.parseInt(st.nextToken());
            int endRental = Integer.parseInt(st.nextToken());
            for(int j = startRental; j<endRental; j++){
                rentalCnt = Math.max(++dateArr[j],rentalCnt);
            }
        }
        int bookCnt = Integer.parseInt(bf.readLine());
        if(rentalCnt <= bookCnt){
            System.out.println(1);
        }else{
            System.out.println(0);
        }  
    }
}