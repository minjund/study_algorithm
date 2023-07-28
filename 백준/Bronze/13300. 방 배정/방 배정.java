import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        // 학년이랑 성별 설정
        int[][] studenInfo = new int[7][2];
        int roomCnt =0;
        for(int i = 0; i < N; i++) {
            int S = sc.nextInt(); //성별
            int Y = sc.nextInt(); //학년
            if(S==0) studenInfo[Y][0]++;
            else studenInfo[Y][1]++;
        }
        
        for(int i=1; i < studenInfo.length; i++){
            for(int j=0; j < studenInfo[i].length; j++){
                if(studenInfo[i][j] == 0) continue;
                
                roomCnt += studenInfo[i][j] / K;
                if(studenInfo[i][j] % K != 0){
                    roomCnt++;
                }
            }
        }
        System.out.println(roomCnt);
    }
}