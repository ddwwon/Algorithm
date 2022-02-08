package Inflearn;

import java.util.Scanner;

public class Q0105 {
    public String solution(String str){
        String answer = "";
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length()-1; // 왼쪽 끝, 오른쪽 끝
        while(lt < rt){
            if(!Character.isAlphabetic(s[lt])) lt++; // 알파벳이 아닐때 (= 특수문자일 때) lt 증가
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++; rt--;
            }
        }
        answer = String.valueOf(s);
        
        return answer;
    }
    public static void main(String[] args){
        Q0105 T = new Q0105();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
