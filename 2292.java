/*���� �׸��� ���� ���������� �̷���� ������ �ִ�. �׸����� ���� �ٿ� ���� �߾��� �� 1���� �����ؼ� �̿��ϴ� �濡 ���ư��鼭 1�� �����ϴ� ��ȣ�� �ּҷ� �ű� �� �ִ�. ���� N�� �־����� ��, ������ �߾� 1���� N�� ����� �ּ� ������ ���� ������ �� �� �� ���� ���� ����������(���۰� ���� �����Ͽ�)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ���� ���, 13������ 3��, 58������ 5���� ������.

�Է�
ù° �ٿ� N(1 �� N �� 1,000,000,000)�� �־�����.

���
�Է����� �־��� ����� �ּ� ������ ���� ������ �� �� �� ���� ���� �������� ����Ѵ�.*/

/*
����

1 7 19 37 61 ....
 6 12 18 24 ....

*/
import java.io.*;

class Main
{	
	static int getAnswer(int inputNum){
		int start = 1; 
		int answer = 1;
		int range = 6 * answer;
		int sum = 0;
		
		if( inputNum == start) return 1;
		else{
			while (true){
				sum += start + range;
				if( inputNum <= sum){
					return answer+1;
				}else answer++;
			}
		}
	}
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputNum = Integer.parseInt(br.readLine());
		int answer = getAnswer(inputNum);
		System.out.println(answer);
		
	}
}
