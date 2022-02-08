package Inflearn;

import java.util.Scanner;

public class Q0108 {
    public String solution(String str){
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", ""); // 대문자 A~Z가 아니라면 전부 ""로 변경
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) answer = "YES";
        return answer;
    }
    public static void main(String[] args){
        Q0108 T = new Q0108();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}