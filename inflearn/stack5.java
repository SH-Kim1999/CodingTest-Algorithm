package org.example;

import java.util.Scanner;
import java.util.Stack;

class Main{
    public int solution(String arr){
        int answer =0;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<arr.length();i++){
            if(arr.charAt(i)=='(') stack.push('(');
            else{
                stack.pop();
                if(arr.charAt(i-1)=='(') answer+=stack.size();
                else answer++;
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String arr = sc.next();
        System.out.print(T.solution(arr));
    }
}