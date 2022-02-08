package Inflearn;
import java.util.Scanner;

public class Q0103 {
    public String solution(String str){
        String answer = "";
        int max = Integer.MIN_VALUE, pos; // 가장 작은 값으로 초기화
        while((pos = str.indexOf(' ')) != -1){ // 띄어쓰기를 발견하지 못하면 -1 리턴
            String tmp = str.substring(0, pos); // 0 ~ pos 전까지(띄어쓰기 전까지)
            int len = tmp.length();
            if(len > max){
                max = len;
                answer = tmp;
            }
            str = str.substring(pos+1); // pos+1 부터 끝까지
        }
        if(str.length() > max) {
            answer = str;
        }

        return answer;
    }
    public static void main(String[] args) {
        Q0103 T = new Q0103();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(T.solution(str));
    }
}
