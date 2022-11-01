import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char[][] board = {
                        {'W','B','W','B','W','B','W','B'},
                        {'B','W','B','W','B','W','B','W'},
                        {'W','B','W','B','W','B','W','B'},
                        {'B','W','B','W','B','W','B','W'},
                        {'W','B','W','B','W','B','W','B'},
                        {'B','W','B','W','B','W','B','W'},
                        {'W','B','W','B','W','B','W','B'},
                        {'B','W','B','W','B','W','B','W'}
                        };
            char[][] isF = new char[8][8];
            String reslut = ""; 
            int Cnt = 0;
            for (int i = 0; i < isF.length; i++) {
                reslut = sc.nextLine();
                for (int j = 0; j < isF.length; j++) {
                       isF[i][j] = reslut.charAt(j);
                }
            }
            
           for (int i = 0; i < isF.length; i++) {
                for (int j = 0; j < isF.length; j++) {
                    if(board[i][j] == 'W' && isF[i][j] == 'F'){
                        Cnt++;
                    }
                }
            }
            System.out.print(Cnt);
    }

}