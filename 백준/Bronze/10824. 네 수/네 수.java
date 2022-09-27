import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        
        String[] strSplit = str.split(" ");
        Long frist = Long.parseLong(strSplit[0]+strSplit[1]);
        Long second =  Long.parseLong(strSplit[2]+strSplit[3]);
        sb.append(frist+second);
        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }
}