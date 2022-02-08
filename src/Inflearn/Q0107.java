package Inflearn;

import java.util.Scanner;

public class Q0107 {
    public String solution(String str){
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) answer = "YES";
        return answer;
    }
    public static void main(String[] args){
        Q0107 T = new Q0107();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
