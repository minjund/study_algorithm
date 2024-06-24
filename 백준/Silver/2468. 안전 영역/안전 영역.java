import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};
    static int[][] map;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<int[]> q = new LinkedList<>();

        int n = Integer.parseInt(st.nextToken());
        int result = 0;
        map = new int[n][n];

        int max = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                //안전지대 체크
                max = Math.max(max, map[i][j]);
            }
        }
        
        for (int k = 0; k <= max; k++) {
            visited = new boolean[n][n];
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!visited[i][j] && map[i][j] > k) {
                        visited[i][j] = true;
                        q.offer(new int[]{i, j});

                        while (!q.isEmpty()) {
                            int[] cur = q.poll();
                            int x = cur[0];
                            int y = cur[1];

                            for (int l = 0; l < 4; l++) {
                                int nx = x + dx[l];
                                int ny = y + dy[l];

                                if (nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
                                //방문했더나 잠겨있으면
                                if (visited[nx][ny] ) continue;

                                if(map[nx][ny] > k) {
                                    visited[nx][ny] = true;
                                    q.offer(new int[]{nx, ny});
                                }
                            }
                        }
                        cnt++;
                    }
                }
            }
            result = Math.max(result, cnt);
        }
        System.out.println(result);
    }
}
