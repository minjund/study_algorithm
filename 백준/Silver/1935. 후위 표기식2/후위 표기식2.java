import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 피연산자의 개수 N
        int N = Integer.parseInt(br.readLine());

        // 피연산자는 A-Z 영대문자이며, A부터 순서대로 N개의 영대문자만 사용
        char[] array = br.readLine().toCharArray();

        // 후입선출의 자료구조 Stack선언
        Stack < Double > stack = new Stack < > ();

        // 키와 값으로 구성된 Map선언
        Map < Character, Double > map = new HashMap < > ();

        // N의 개수만큼 피연산자에 대응되는 값을 설정
        char key = 'A';
        for (int i = 0; i < N; i++) {
            map.put(key, Double.parseDouble(br.readLine()));
            key++;
        }

        // array의 길이만큼 반복문 수행
        for (int i = 0; i < array.length; i++) {
            // 인덱스의 값이 A-Z인 경우
            if ('A' <= array[i] && array[i] <= 'Z') {
                stack.push(map.get(array[i]));
            }
            // 그외의 경우
            else {
                double answer1 = stack.pop();
                double answer2 = stack.pop();

                switch (array[i]) {
                    case '+':
                        stack.push(answer2 + answer1);
                        break;
                    case '-':
                        stack.push(answer2 - answer1);
                        break;
                    case '*':
                        stack.push(answer2 * answer1);
                        break;
                    case '/':
                        stack.push(answer2 / answer1);
                        break;
                }
            }
        }
        // 결과 값 출력
        System.out.println(String.format("%.2f", stack.pop()));
    }
}