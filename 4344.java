/*
����
���л� ��������� 90%�� �ڽ��� �ݿ��� ����� �Ѵ´ٰ� �����Ѵ�. ����� �׵鿡�� ���� ������ �˷���� �Ѵ�.

�Է�
ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.

��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, �̾ N���� ������ �־�����. ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.

���
�� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.
*/

import java.io.*;
import java.util.StringTokenizer;

class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int j=0; j<num; j++){
			
			String[] scoreStr = br.readLine().split(" ");
			int stuNum = Integer.parseInt(scoreStr[0]);
			int sum = 0;
			for(int i=1; i<scoreStr.length; i++){
				int score = Integer.parseInt(scoreStr[i]);
				sum += score;
			}
			double avg = (double)sum / stuNum ;
			
			double cnt = 0;
			for(int i=1; i<scoreStr.length; i++){
				int score = Integer.parseInt(scoreStr[i]);
				if( score>avg ) cnt++;
			}
			double ratio = (cnt / stuNum)*100;
			System.out.println( String.format("%.3f",ratio)+"%");

		}
	}
	
}
