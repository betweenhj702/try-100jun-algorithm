/*
����
N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ������ ���� N (1 �� N �� 100)�� �־�����. ��° �ٿ� ���� N���� ������� �־�����.

���
�Է����� �־��� ���� N���� ���� ����Ѵ�.
*/
import java.io.*;

class Main 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String line = br.readLine();
		int sum = 0;
		for(int i=0;i<num;i++){
			sum +=  line.charAt(i) -'0';	//0�� �ƽ�Ű�ڵ带 ���ִ� ��
		}
		System.out.println(sum);
		
		// git bash test
	}
}
