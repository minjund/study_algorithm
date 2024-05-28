import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] map;
    static int[][] dist;
    static int area = 1;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(tk.nextToken());
        Queue<int[]> q = new LinkedList<>();
        Queue<int[]> b = new LinkedList<>();


        map = new int[n][n];
        dist = new int[n][n];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            tk = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(tk.nextToken());
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ( map[i][j] != 1) continue;

                map[i][j] = ++area;
                q.offer(new int[]{i,j});
                b.offer(new int[]{i,j,area});

                while (!q.isEmpty()){
                    int[] temp = q.poll();
                    int x = temp[0];
                    int y = temp[1];

                    for (int k = 0; k < 4; k++) {
                        int ax = x + dx[k];
                        int ay = y + dy[k];

                        if (ax < 0 || ay < 0 || ax >= n || ay >=n ) continue;
                        if (map[ax][ay] != 1) continue;

                        map[ax][ay] = area;
                        q.add(new int[]{ax,ay});
                        b.add(new int[]{ax,ay,area});
                    }
                }
            }
        }

        while (!b.isEmpty()){
            int[] temp = b.poll();

            int now_x = temp[0];
            int now_y = temp[1];
            int IsNum = temp[2];
            int path = dist[now_x][now_y];

            for (int i = 0; i < 4; i++) {
                int new_x = now_x + dx[i];
                int new_y = now_y + dy[i];

                if (new_x < 0 || new_y < 0 || new_x >= n || new_y >=n ) continue;
                int num = map[new_x][new_y];

                if (num == IsNum) continue;

                if (num == 0){
                    dist[new_x][new_y] = path + 1;
                    map[new_x][new_y] = IsNum;
                    b.add(new int[]{new_x,new_y,IsNum});
                } else {
                    min = Math.min(min,path + dist[new_x][new_y]);
                }
            }
        }


        System.out.println(min);

    }
}
