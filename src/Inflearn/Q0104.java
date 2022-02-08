package Inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class Q0104 {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x: str){
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length()-1; // lt: 왼쪽 끝, rt: 오른쪽 끝
            while(lt < rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++; rt--;
            }
            String tmp = String.valueOf(s); // s: 문자배열 -> String으로 변환
            answer.add(tmp);
        }
        return answer;
    }
    public static void main(String[] args){
        Q0104 T = new Q0104();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = sc.next();
        }
        for(String x: T.solution(n, str)){
            System.out.println(x);
        }
    }
}
