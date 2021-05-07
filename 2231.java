/*
����
� �ڿ��� N�� ���� ��, �� �ڿ��� N�� �������� N�� N�� �̷�� �� �ڸ����� ���� �ǹ��Ѵ�. � �ڿ��� M�� �������� N�� ���, M�� N�� �����ڶ� �Ѵ�. ���� ���, 245�� �������� 256(=245+2+4+5)�� �ȴ�. ���� 245�� 256�� �����ڰ� �ȴ�. ����, � �ڿ����� ��쿡�� �����ڰ� ���� ���� �ִ�. �ݴ��, �����ڰ� ���� ���� �ڿ����� ���� �� �ִ�.

�ڿ��� N�� �־����� ��, N�� ���� ���� �����ڸ� ���س��� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �ڿ��� N(1 �� N �� 1,000,000)�� �־�����.

���
ù° �ٿ� ���� ����Ѵ�. �����ڰ� ���� ��쿡�� 0�� ����Ѵ�.

sol)
1. �����ڸ� ���ϴ� �޼ҵ带 �����.
2. 1~ �־��� ������ �ݺ����� ���� �־������� ��ġ�� ���� ���ڸ� ��ȯ�Ѵ�.
3. ������ 0 ���
*/

import java.io.*;

class Main2231 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(br.readLine());
        System.out.println(getAnswer(caseNum));
    }

    static int getAnswer(int caseNum){
        for(int i=0; i<caseNum; i++){
            int num = i;
            int sum = num;
            while(num != 0){
                sum = sum + (num % 10);
                num = num / 10;
            }
            if(sum == caseNum){
                return i;
            }
        }
        return 0;
    }
}
