/*
����
�� ���� �����̰� �ִ�. �� �����̴� ���̰� V������ ���� ���븦 �ö� ���̴�.

�����̴� ���� A���� �ö� �� �ִ�. ������, �㿡 ���� �ڴ� ���� B���� �̲�������. ��, ���� �ö� �Ŀ��� �̲������� �ʴ´�.

�����̰� ���� ���븦 ��� �ö󰡷���, ��ĥ�� �ɸ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �� ���� A, B, V�� �������� ���еǾ �־�����. (1 �� B < A �� V �� 1,000,000,000)

���
ù° �ٿ� �����̰� ���� ���븦 ��� �ö󰡴µ� ��ĥ�� �ɸ����� ����Ѵ�.
*/

import java.io.*;

class Main
{
	public static int getAnswer(int A, int B, int V){
		int lengthExceptLastDay = V-A;
		int dayToClimb = lengthExceptLastDay/(A-B);
		if( lengthExceptLastDay%(A-B) != 0){
			dayToClimb++;
		}
		dayToClimb += 1;
		return dayToClimb;
	}
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputStr = br.readLine().split(" ");
		int A = Integer.parseInt(inputStr[0]);
		int B = Integer.parseInt(inputStr[1]);
		int V = Integer.parseInt(inputStr[2]);
		System.out.println(getAnswer(A,B,V));
		
	}
}
