
/*
������ ū �迭�� ������ ���� �м����� �����ִ�.

1/1	1/2	1/3	1/4	1/5	��
2/1	2/2	2/3	2/4	��	��
3/1	3/2	3/3	��	��	��
4/1	4/2	��	��	��	��
5/1	��	��	��	��	��
��	��	��	��	��	��
�̿� ���� ������ �м����� 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> �� �� ���� ������� ������ ���ʴ�� 1��, 2��, 3��, 4��, 5��, �� �м���� ����.

X�� �־����� ��, X��° �м��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
