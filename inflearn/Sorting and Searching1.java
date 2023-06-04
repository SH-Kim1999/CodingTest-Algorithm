import java.util.ArrayList;
import java.util.Scanner;

class Main {
    int[] solution(int[] arr, int n) {
        //ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[idx] > arr[j]) {
                    idx = j;
                }
            }
            if (arr[idx] < arr[i]) {
                int tmp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = tmp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : T.solution(arr, n)) System.out.print(x + " ");
    }
}