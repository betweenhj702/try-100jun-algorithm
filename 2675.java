/*
����
���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��, ù ��° ���ڸ� R�� �ݺ��ϰ�, �� ��° ���ڸ� R�� �ݺ��ϴ� ������ P�� ����� �ȴ�. S���� QR Code "alphanumeric" ���ڸ� ����ִ�.

QR Code "alphanumeric" ���ڴ� 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: �̴�.

�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ���� T(1 �� T �� 1,000)�� �־�����. �� �׽�Ʈ ���̽��� �ݺ� Ƚ�� R(1 �� R �� 8), ���ڿ� S�� �������� ���еǾ� �־�����. S�� ���̴� ��� 1�̸�, 20���ڸ� ���� �ʴ´�. 

���
�� �׽�Ʈ ���̽��� ���� P�� ����Ѵ�.
*/
import java.io.*;
import java.util.*;

class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int testNum = Integer.parseInt(br.readLine());
		
		for(int k=0;k<testNum;k++){
			StringTokenizer st = new StringTokenizer(br.readLine());

			int num = Integer.parseInt(st.nextToken());
			if(st.hasMoreTokens()){
				String s = st.nextToken();
				StringBuilder p = new StringBuilder();
				for(int j=0;j<s.length();j++){
					String sSub = s.substring(j,j+1);
					for(int i=0;i<num;i++){
						p.append(sSub);
					}
				}
				System.out.println(p);
			}
		}
	}
}
