/*
�����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. �ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. �� ���� M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.

���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.

�������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է� : ù° �ٿ� ���� �� ������ ���� N�� �־�����. �� ���� 1000���� �۰ų� ����. ��° �ٿ� �������� ���� ������ �־�����. �� ���� 100���� �۰ų� ���� ���� �ƴ� �����̰�, ��� �ϳ��� ���� 0���� ũ��.

��� : ù° �ٿ� ���ο� ����� ����Ѵ�. ���� ����� ��°��� ������� �Ǵ� �������� 10-2 �����̸� �����̴�.
*/

import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		float jumsu[] = new float[num];
		
		String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line);
		int i = 0;
		while(st.hasMoreTokens()){
			jumsu[i] = Integer.parseInt(st.nextToken());
			i++;	
		}
		
		Arrays.sort(jumsu);
		int max = (int) jumsu[num-1];
		float sum = 0f;
		for(float j: jumsu){
			j = j/max*100;
			sum += j;
		}
		System.out.println(sum/num);
	}
}
