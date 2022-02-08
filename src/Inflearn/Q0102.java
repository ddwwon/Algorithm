package Inflearn;
import java.util.*;

public class Q0102 {
    public String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)) // x가 소문자인 경우
            {
                answer += Character.toUpperCase(x);
            }
            else { // x가 대문자인 경우
                answer += Character.toLowerCase(x);
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Q0102 T = new Q0102();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(T.solution(str));
    }
}
