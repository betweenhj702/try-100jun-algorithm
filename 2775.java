/*
����
��� �ݻ�ȸ�� �����ϴ� ���� �����ϴ� ����� �̹� ��ȸ�� �γ�ȸ���� �ǰ� �;� �� ���� ������� �ҷ� ��� �ݻ�ȸ�� �����Ϸ��� �Ѵ�.

�� ����Ʈ�� ���ָ� �Ϸ��� ������ �ִµ�, ��a���� bȣ�� ����� �ڽ��� �Ʒ�(a-1)���� 1ȣ���� bȣ���� ������� ���� �ո�ŭ ������� ������ ��ƾ� �Ѵ١� �� ��� ������ �� ��Ű�� ���;� �Ѵ�.

����Ʈ�� ����ִ� ���� ���� ��� ���ֹε��� �� ��� ������ ��Ű�� �Դٰ� �������� ��, �־����� ���� ���� k�� n�� ���� k���� nȣ���� �� ���� ��� �ִ��� ����϶�. ��, ����Ʈ���� 0������ �ְ� �������� 1ȣ���� ������, 0���� iȣ���� i���� ���.

�Է�
ù ��° �ٿ� Test case�� �� T�� �־�����. �׸��� ������ ���̽����� �Է����� ù ��° �ٿ� ���� k, �� ��° �ٿ� ���� n�� �־�����

���
������ Test case�� ���ؼ� �ش� ���� ���ֹ� ���� ����϶�.


��Ģ
4�� 1 6 21 56 126	...
3�� 1 5 15 35 70		...
2�� 1 4 10 20 35		...		
1�� 1 3  6 10 15		...	

0�� 1 2  3  4  5		...	
0�� 1 1  1  1  1


5C0 6C1 7C2 8C3 ....
4C0 5C1 6C2 7C3 ....
3C0 4C1 5C2 6C3 ...
2C0 3C1 4C2 5C3 ....

��Ģ k�� nȣ�� ������ ���� 
(k+n)C(n-1) = (k+n)!/(k+n-n+1)!/(n-1)!
*/

import java.io.*;
import java.math.BigInteger;

class Main{
    static long getAns(int k, int n){
		// ��Ģ k�� nȣ�� ������ ���� (k+n)C(n-1) = (k+n)!/(k+n-n+1)!/(n-1)!
		// �������� �����÷ο찡 �Ǳ� ������ BigInteger Ŭ������ �̿��ؼ� �����.
		Integer t = k + n;
		BigInteger numerator = new BigInteger("1");
		Long denominatorK = 1L;
		Long denominatorN = 1L;
		while(t > 0){
			BigInteger tBig = new BigInteger(t.toString());
			numerator = numerator.multiply(tBig);
			t--;
		}
		while(k > -1){
			denominatorK *= (k + 1);
			k--;
		}
		while(n > 1){
			denominatorN *= (n - 1);
			n--;
		}
		long answer = numerator.divide(new BigInteger(denominatorK.toString())).divide(new BigInteger(denominatorN.toString())).longValue();
		//System.out.println(numerator +"/ "+denominatorK+"/ "+denominatorN);
		return answer;
	}
	
	public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testNum = Integer.parseInt(br.readLine());
		StringBuilder answer = new StringBuilder();
		for(int i=0; i < testNum; i++){
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			answer.append(getAns(k, n)+"\n");
		}
		bw.write(answer.toString());
		bw.flush();
		bw.close();
    }
}

/* �ٸ� ����� ��
������ �迭�� ���� ���ֹ��� �����ϰ�, �Է¹��� ��,ȣ���� ���� �迭�� ����� ���� ����Ѵ�.

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int chart[][] = new int[15][14];	 
        for(int i = 0;i<14;i++){	// 0�� 1 2 3 4 ... �� 1ȣ 1 1 1 1 ... �� �̸� �Է��Ѵ�
            chart[0][i] =i+1;
            chart[i][0] = 1;
        }
        chart[14][0]= 1;
        for(int x = 1; x<15;x++) {	// 1��(x)���� ��� ȣ(y)�� ���ֹ��� ���� ���Ѵ�.
            for(int y = 1;y<14;y++){
                chart[x][y] = chart[x][y-1] + chart[x-1][y];
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<testCase;i++) {
            int floor = Integer.parseInt(br.readLine());
            int room = Integer.parseInt(br.readLine());
            sb.append(chart[floor][room-1]).append("\n");
        }
        System.out.println(sb);
    }
}

*/