package Inflearn;

import java.util.Scanner;

public class Q1012 {
    public String solution(int n, String s){
        String answer = "";
        for(int i = 0; i < n; i++){
            String temp = s.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(temp, 2); // 2진수를 10진수로 변환
            answer += (char)num;
            s = s.substring(7); // 7부터 끝까지
        }
        return answer;
    }
    public static void main(String[] args){
        Q1012 T = new Q1012();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(T.solution(n, str));
    }
}
