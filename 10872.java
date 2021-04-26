/*
    0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
*/

import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        System.out.println(getAnswer(number));    
    }
    
    static int answer = 1;
    static int getAnswer(int number){    
        if(number == 0) return answer; 
        answer *= number--;
        if(number > 0){
            getAnswer(number);
        }
        return answer;
    }
}

/* 
 다른 사람의 답
 
public static int factorial(int n) {
    if(n==0) {
        return 1;
    }
    else
        return n*factorial(n-1);
}
*/