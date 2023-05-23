package org.example;

import java.util.Scanner;

class Main {
    public int solution(int n, int m, int[] a) {
        int answer = 0;
        int p1 = 0, sum = 0;
        for (int p2 = 0; p2 < n; p2++) {
            sum += a[p2];
            if (sum == m) answer++;
            while (sum > m) {
                sum -= a[p1++];
                if (sum == m) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, m, a));
    }
}