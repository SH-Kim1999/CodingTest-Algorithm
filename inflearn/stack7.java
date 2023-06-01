package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {
    public String solution(String a, String b) {
        String answer = "NO";
        Queue<Character> que = new LinkedList<>();
        for (int i = 0; i < a.length(); i++) {
            que.offer(a.charAt(i));
        }

        for (int i = 0; i < b.length(); i++) {
            if (!que.isEmpty()) {
                if (b.charAt(i) == que.peek()) {
                    que.poll();
                }
            }else answer = "YES";
        }


        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String required = sc.next();
        String optional = sc.next();

        System.out.println(T.solution(required, optional));
    }
}