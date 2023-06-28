import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseCount = 0;
        caseCount = Integer.parseInt(bf.readLine());

        String[] numbersSet = new String[caseCount];

        for (int i = 0; i < caseCount; i++) {
            numbersSet[i] = bf.readLine();
        }

        for (int i = 0; i < caseCount; i++) {
            int numberA = Integer.parseInt(numbersSet[i].split(" ")[0]);
            int numberB = Integer.parseInt(numbersSet[i].split(" ")[1]);
            int sum = numberA + numberB;
            bw.write(String.valueOf(sum));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}