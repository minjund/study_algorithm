import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    //세로
    static int[] dx = {-1, 0, 1, 0}; // 상 오 하 왼

    //가로
    static int[] dy = {0, 1, 0, -1}; // 상 오 하 왼

    static int[][] map;
    static boolean[][] visit;

    public static void main(String[] args) throws IOException {

        BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sb.readLine());

        //세로
        int n = Integer.parseInt(st.nextToken());
        //가로
        int m = Integer.parseInt(st.nextToken());

        Queue<int[]> q = new LinkedList<>();

        map = new int[n][m];
        visit = new boolean[n][m];

        // 처음 맵 세팅
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(sb.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int num = 0;//총 갯수,
        int max = 0; // 가장큰 그림 값

        //시작점이 2개 이상 일수 있으니 2중 포문
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(map[i][j] == 0 || visit[i][j]) continue;

                num++; // 카운팅
                visit[i][j] = true; //방문함
                q.offer(new int[]{i,j}); //추가

                int area = 0; // 영역 초기화

                //q가 들어있으면 영역 카운팅
                while (!q.isEmpty()){
                    area++;
                    int[] temp = q.poll();
                    int x = temp[0];
                    int y = temp[1];
                    for (int k = 0; k < 4; k++) {
                        int nx = x + dx[k];
                        int ny = y + dy[k];

                        // 비교
                        if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                        if (visit[nx][ny] || map[nx][ny] != 1) continue;

                        visit[nx][ny] = true;

                        q.offer(new int[]{nx,ny});
                    }
                }
                max = Math.max(max, area); // 더 큰 영역 추가
            }
        }
        System.out.println(num);
        System.out.println(max);
    }
}
