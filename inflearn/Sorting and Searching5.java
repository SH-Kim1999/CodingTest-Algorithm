import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = n - 1; i >= 1; i--) {
            int tg = -1;
            if (arr[i] < arr[i - 1]) {
                if (tg == -1) {
                    tg = i;
                    answer.add(tg);
                } else {
                    answer.add(i);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : T.solution(n, arr)) System.out.print(x + " ");

    }
}