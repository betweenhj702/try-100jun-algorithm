
/*
무한히 큰 배열에 다음과 같이 분수들이 적혀있다.

1/1	1/2	1/3	1/4	1/5	…
2/1	2/2	2/3	2/4	…	…
3/1	3/2	3/3	…	…	…
4/1	4/2	…	…	…	…
5/1	…	…	…	…	…
…	…	…	…	…	…
이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.

X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
*/

import java.io.*;

class Main
{
	public static String getAnswer(int inputNum){
		int groupNum = 1; int groupMaxNum = 1;
		while(true){
			if(inputNum <= groupMaxNum){
				return getNumberPair(groupNum, groupMaxNum - groupNum + 1, inputNum);			
			}else{
				groupNum++;
				groupMaxNum += groupNum;
			}
		}
	}
	
	public static String getNumberPair(int groupNum, int startNumOfGroup, int inputNum){
		//System.out.println(startNumOfGroup+" "+ groupNum + " " + inputNum);
		int groupSum = groupNum + 1;
		int x=0;int y=0;
		if(groupNum%2 == 0){	
			x = 1 + inputNum - startNumOfGroup;
			y = groupSum - x;
		}else{
			y = 1 + inputNum - startNumOfGroup;
			x = groupSum - y;
		}
		StringBuilder answer = new StringBuilder();
		answer.append(x).append("/").append(y);
		return answer.toString();
	}

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int inputNum = Integer.parseInt(br.readLine());
		bw.write(getAnswer(inputNum));
		bw.flush();
		bw.close();
	}
}
