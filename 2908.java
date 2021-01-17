/*문제
상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다. 이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다. 상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.

상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.

두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.

출력
첫째 줄에 상수의 대답을 출력한다.*/

import java.io.*;

class  Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] num = line.split(" ");
		StringBuilder[] sb = new StringBuilder[num.length];

		for(int j=0;j<num.length;j++){
			sb[j] = new StringBuilder();
			for(int i = num[j].length(); i>=1; i--){
				sb[j].append(num[j].substring(i-1,i));
			}
		}

//		System.out.println(sb[0]);
//		System.out.println(sb[1]);
		
		int max=0;int a=0;
		max = Integer.parseInt(sb[0].substring(0));
	
		for(int i=1;i<num.length;i++){
			a = Integer.parseInt(sb[i].substring(0));
			if(a>max) max = a;
		}
		System.out.println(max);
	}
}

/* 다른 사람의 답
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		int x[] = new int[2];
		for(int i=0; i<2; i++) {
			int a = System.in.read() -'0';
			int b = System.in.read()-'0';
			int c = System.in.read()-'0';
			int line = System.in.read();
			x[i] = c*100 + b*10 + a;
		}
		if(x[0] > x[1]) System.out.println(x[0]);
		else System.out.println(x[1]);
	}
}
*/