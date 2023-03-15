import java.util.*;
import java.io.*;
class Main{
    static int n,m,k;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int[][] map;
    static boolean[][] visited;
    static List<Integer> ans = new ArrayList<>();
    static int total;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        map = new int[n+1][m+1];
        visited = new boolean[n+1][m+1];
        while(k-- > 0)
        {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            
            for(int i=y1;i<y2;i++)
            {
                for(int j=x1;j<x2;j++)
                {
                    map[i][j] = 1;
                }
            }
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(map[i][j] == 0 && !visited[i][j])
                {
                    bfs(i,j);
                    total++;
                }
            }
        }
        Collections.sort(ans);
        sb.append(total).append('\n');
        for(int i=0;i<total;i++)
        {
            sb.append(ans.get(i)).append(' ');
        }
        System.out.println(sb);
    }
    static void bfs(int y, int x)
    {
        Queue<Pos> q = new LinkedList<>();
        q.add(new Pos(y,x));
        visited[y][x] = true;
        int cnt = 0;
        while(!q.isEmpty())
        {
            Pos p = q.poll();
            cnt++;
            for(int i=0;i<4;i++)
            {
                int ny = p.y + dy[i];
                int nx = p.x + dx[i];
                if(ny>=0 && nx>=0 && ny<n && nx<m)
                {
                    if(!visited[ny][nx] && map[ny][nx] == 0)
                    {
                        visited[ny][nx] = true;
                        q.add(new Pos(ny,nx));
                    }
                }
            }
        }
        ans.add(cnt);
    }
}
class Pos{
    int y,x;
    public Pos(int y, int x)
    {
        this.y = y;
        this.x = x;
    }
}
