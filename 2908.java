/*����
������� ���� ����� ������ ���� ���Ѵ�. ����� ���ڸ� �дµ� ������ �ִ�. �̷��� ������ ���ϴ� ����� ���ؼ� ����̴� ���� ũ�⸦ ���ϴ� ������ ���־���. ����̴� �� �ڸ� �� �� ���� ĥ�ǿ� ���־���. �� ������ ũ�Ⱑ ū ���� ���غ���� �ߴ�.

����� ���� �ٸ� ����� �ٸ��� �Ųٷ� �д´�. ���� ���, 734�� 893�� ĥ�ǿ� �����ٸ�, ����� �� ���� 437�� 398�� �д´�. ����, ����� �� ���� ū ���� 437�� ū ����� ���� ���̴�.

�� ���� �־����� ��, ����� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ����̰� ĥ�ǿ� ���� �� �� A�� B�� �־�����. �� ���� ���� ���� �� �ڸ� ���̸�, 0�� ���ԵǾ� ���� �ʴ�.

���
ù° �ٿ� ����� ����� ����Ѵ�.*/

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

/* �ٸ� ����� ��
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