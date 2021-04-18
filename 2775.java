/*
문제
평소 반상회에 참석하는 것을 좋아하는 주희는 이번 기회에 부녀회장이 되고 싶어 각 층의 사람들을 불러 모아 반상회를 주최하려고 한다.

이 아파트에 거주를 하려면 조건이 있는데, “a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다” 는 계약 조항을 꼭 지키고 들어와야 한다.

아파트에 비어있는 집은 없고 모든 거주민들이 이 계약 조건을 지키고 왔다고 가정했을 때, 주어지는 양의 정수 k와 n에 대해 k층에 n호에는 몇 명이 살고 있는지 출력하라. 단, 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.

입력
첫 번째 줄에 Test case의 수 T가 주어진다. 그리고 각각의 케이스마다 입력으로 첫 번째 줄에 정수 k, 두 번째 줄에 정수 n이 주어진다

출력
각각의 Test case에 대해서 해당 집에 거주민 수를 출력하라.


규칙
4층 1 6 21 56 126	...
3층 1 5 15 35 70		...
2층 1 4 10 20 35		...		
1층 1 3  6 10 15		...	

0층 1 2  3  4  5		...	
0하 1 1  1  1  1


5C0 6C1 7C2 8C3 ....
4C0 5C1 6C2 7C3 ....
3C0 4C1 5C2 6C3 ...
2C0 3C1 4C2 5C3 ....

규칙 k층 n호의 거주자 수는 
(k+n)C(n-1) = (k+n)!/(k+n-n+1)!/(n-1)!
*/

import java.io.*;
import java.math.BigInteger;

class Main{
    static long getAns(int k, int n){
		// 규칙 k층 n호의 거주자 수는 (k+n)C(n-1) = (k+n)!/(k+n-n+1)!/(n-1)!
		// 분자항은 오버플로우가 되기 때문에 BigInteger 클래스를 이용해서 계산함.
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

/* 다른 사람의 답
이차원 배열에 방의 거주민을 저장하고, 입력받은 층,호수에 따라 배열에 저장된 값을 출력한다.

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int chart[][] = new int[15][14];	 
        for(int i = 0;i<14;i++){	// 0층 1 2 3 4 ... 과 1호 1 1 1 1 ... 을 미리 입력한다
            chart[0][i] =i+1;
            chart[i][0] = 1;
        }
        chart[14][0]= 1;
        for(int x = 1; x<15;x++) {	// 1층(x)부터 모든 호(y)의 거주민의 수를 구한다.
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