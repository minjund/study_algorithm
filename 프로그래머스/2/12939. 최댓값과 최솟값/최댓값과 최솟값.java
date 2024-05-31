import java.util.*;
class Solution {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        int max = -100_000;
        int min = 100_000;
        int count = st.countTokens();
        for(int i =0; i < count; i++){
             int word = Integer.parseInt(st.nextToken());
             max = Math.max(max, word);
             min = Math.min(min, word);
        }
        
        String answer = min +" "+ max;
        return answer;
    }
}