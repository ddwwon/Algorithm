package Inflearn;

import java.util.Scanner;

public class Q0110 {
    public int[] solution(String str, char t){
        int[] answer = new int[str.length()];
        int p = 1000;
        for(int i = 0; i < str.length(); i++){ // 왼쪽에서부터 t와 떨어진 거리
            if(str.charAt(i) == t){
                p = 0;
                answer[i] = p;
            }
            else {
                p++;
                answer[i] = p;
            }
        }
        p = 1000;
        for(int i = str.length()-1; i >= 0; i--) // 오른쪽에서부터 t와 떨어진 거리
        {
            if(str.charAt(i) == t) p = 0;
            else {
                p++;
                answer[i] = Math.min(answer[i], p); // 왼쪽과 오른쪽과의 거리 중에서 작은 값 선택
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Q0110 T = new Q0110();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        for(int x : T.solution(str, c)){
            System.out.print(x + " ");
        }
    }
}