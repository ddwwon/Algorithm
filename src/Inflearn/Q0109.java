package Inflearn;

import java.util.Scanner;

public class Q0109 {
    public int solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
           if(Character.isDigit(x)){
               answer += x;
           }
        }
        return Integer.parseInt(answer);
    }
    public static void main(String[] args){
        Q0109 T = new Q0109();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}