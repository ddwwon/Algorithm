import java.util.*;

public class Q10828 {
    public static int[] Stack;
    public static int size = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        Stack = new int[N];

        for (int i = 0; i < N; i++) {
            String command = sc.next(); // nextLine 말고 next로 받아줘야 함
            switch (command) {
                case "push":
                    push(sc.nextInt());
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                case "size":
                    sb.append(size).append('\n');
                    break;
                case "empty":
                    sb.append(isEmpty()).append('\n');
                    break;
                case "top":
                    sb.append(top()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void push(int num) {
        Stack[size] = num;
        size++;
    }

    public static int pop() {
        if (size == 0) {
            return -1;
        } else {
            int temp = Stack[size - 1];
            Stack[size - 1] = 0;
            size--;
            return temp;
        }
    }

    public static int isEmpty() {
        if (size == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int top() {
        if (size == 0) {
            return -1;
        } else {
            return Stack[size - 1];
        }
    }
}
