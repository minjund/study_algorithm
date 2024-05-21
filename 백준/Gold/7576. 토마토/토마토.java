
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int[][] map;
    static boolean[][] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        Queue<int[]> q = new LinkedList<>();

        int totalTomatoCnt = 0;
        int tomatoCnt = 0;
        map = new int[n][m];
        visit = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 0) totalTomatoCnt ++;
            }
        }

        int day = 0;

        for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {

                if (map[i][j] == -1 || map[i][j] == 0) continue;

                visit[i][j] = true;
                q.offer(new int[]{i,j});
            }
        }

        while (!q.isEmpty()){
            int[] temp = q.poll();
            int x = temp[0];
            int y = temp[1];

            for (int k = 0; k < 4; k++) {
                int ax = x + dx[k];
                int ay = y + dy[k];

                if (ax < 0 || ay < 0 || ax >= n || ay >= m) continue;

                if (map[ax][ay] == 1 || map[ax][ay] == -1 || visit[ax][ay]) continue;
                map[ax][ay] = 1;
                tomatoCnt++;

                visit[ax][ay] = true;

                q.offer(new int[]{ax,ay});
                map[ax][ay] += map[x][y];

                day = Math.max(day,map[ax][ay]);
            }
        }

        if(tomatoCnt != totalTomatoCnt){
            System.out.println(-1);
        } else {
            System.out.println(day == 0 ? day : day-1);
        }
    }
}