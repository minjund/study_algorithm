import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] dx = {1, 0, -1 ,0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] map;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<int[]> q = new LinkedList<>();

        int n = Integer.parseInt(st.nextToken());
        ArrayList<Integer> areaList = new ArrayList<>();

        map = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    visited[i][j] = true;
                    int area = 0;
                    q.offer(new int[]{i, j});

                    while (!q.isEmpty()) {
                        int[] cur = q.poll();
                        int x = cur[0];
                        int y = cur[1];
                        area++;

                        for (int k = 0; k < 4; k++) {
                            int nx = x + dx[k];
                            int ny = y + dy[k];

                            if (nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
                            if (visited[nx][ny] || map[nx][ny] == 0) continue;
                            visited[nx][ny] = true;

                            q.offer(new int[]{nx, ny});
                        }
                    }
                    areaList.add(area);
                }
            }
        }
        Collections.sort(areaList);

        System.out.println(areaList.size());

        areaList.forEach(System.out::println);
    }
}
