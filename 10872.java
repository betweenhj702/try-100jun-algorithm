/*
    0���� ũ�ų� ���� ���� N�� �־�����. �̶�, N!�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
 �ٸ� ����� ��
 
public static int factorial(int n) {
    if(n==0) {
        return 1;
    }
    else
        return n*factorial(n-1);
}
*/