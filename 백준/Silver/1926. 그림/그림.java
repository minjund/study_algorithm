import java.util.*;
import java.io.*;

public class Main {
    static int n, m;
    static int[][] arr;
    static boolean[][] visit;
    static int[] dx;
    static int[] dy;
    static Queue<Pair> qu;

    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        arr = new int[n][m];
        visit = new boolean[n][m];
        qu = new LinkedList<>();
        
        dx = new int[]{1, 0, -1, 0}; // 상좌하우 (x가 행 y가 열)
        dy = new int[]{0, 1, 0, -1}; // 상좌하우
        // 기본세팅
        for(int i=0; i<n; i++){
            st = new StringTokenizer(bf.readLine());
            for(int j=0; j<m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // bfs 돌리기
        int count = 0;
        int area = 0;
        int max = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j] == 0 || visit[i][j]){ //0이거나 방문기록이 있으면 = 다음차례로 넘어가 -> 1찾기
                    continue;
                }
                count++;    
                qu.offer(new Pair(i, j));   
                visit[i][j] = true;     
                area = 0;    
                while(!qu.isEmpty()){ // 큐스택이 없을때까지
                    Pair p = qu.poll();
                    area++;
                    for(int k = 0; k < 4; k++){ //4카씩 체크
                        int n_x = p.x + dx[k]; // 1
                        int n_y = p.y + dy[k]; // 0
                        if(n_x < 0 || n_x >= n || n_y < 0 || n_y >= m){ // 칸이 넘어갈경우는 패스
                            continue;
                        }
                        if(arr[n_x][n_y] == 1 && !visit[n_x][n_y]){ // 해당 칸 방문한적이 없으면
                            qu.offer(new Pair(n_x, n_y)); // qu에 n_x,n_y를 추가
                            visit[n_x][n_y] = true; //방문 ture
                        }
                    }
                }
                if(area > max){ // 지금 지역이 max보다 크면
                    max = area;
                }
            }
            
        }
        System.out.println(count);
        System.out.println(max);
    }
    
    public static class Pair{
        int x;
        int y;
        
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
        
        public int getX(){
            return x;
        }
        public int getY(){
            return y;
        }
        public void setX(int x){
            this.x = x;
        }
        public void setY(int y){
            this.y = y;
        }
        
    }
}