/*
ACM ȣ�� �Ŵ��� ����� �մ��� �����ϴ� ��� �� ���� �����ϰ� �ִ�. �� �������翡 ������ �մԵ��� ȣ�� �������κ��� �ɾ ���� ª�� �Ÿ��� �ִ� ���� ��ȣ�Ѵٰ� �Ѵ�. �������� ���츦 ���� �� ���α׷��� �ۼ��ϰ��� �Ѵ�. �� �������� ��� ��� ȣ�� �������κ��� �ȴ� �Ÿ��� ���� ª���� ���� �����ϴ� ���α׷��� �ۼ��ϰ��� �Ѵ�.

������ �ܼ�ȭ�ϱ� ���ؼ� ȣ���� ���簢�� ����̶�� ��������. �� ���� W ���� ���� �ִ� H �� �ǹ��̶�� �������� (1 �� H, W �� 99). �׸��� ���������ʹ� ���� ���ʿ� �ִٰ� ��������(�׸� 1 ����). �̷� ������ ȣ���� H �� W ���� ȣ���̶�� �θ���. ȣ�� ������ ���� ���������� �ٷ� �տ� �ִµ�, �������� ���������ͱ����� �Ÿ��� �����Ѵ�. �� ��� ������ �� �� ������ �Ÿ��� ���� �Ÿ�(�Ÿ� 1)��� �����ϰ� ȣ���� ���� �ʿ��� ���� �ִٰ� �����Ѵ�.

�� ��ȣ�� YXX �� YYXX �����ε� ���⼭ Y �� YY �� �� ���� ��Ÿ���� XX �� ���������Ϳ������� ������ ���� ��ȣ�� ��Ÿ����. ��, �׸� 1 ���� �������� ǥ���� ���� 305 ȣ�� �ȴ�.

�մ��� ���������͸� Ÿ�� �̵��ϴ� �Ÿ��� �Ű� ���� �ʴ´�. �ٸ� �ȴ� �Ÿ��� ���� ������ �Ʒ����� ���� �� ��ȣ�Ѵ�. ���� ��� 102 ȣ �溸�ٴ� 301 ȣ ���� �� ��ȣ�ϴµ�, 102 ȣ�� �Ÿ� 2 ��ŭ �ɾ�� ������ 301 ȣ�� �Ÿ� 1 ��ŭ�� ������ �Ǳ� �����̴�. ���� ������ 102 ȣ���� 2101 ȣ�� �� ��ȣ�Ѵ�.

�������� �ۼ��� ���α׷��� �ʱ⿡ ��� ���� ����ִٰ� �����Ͽ� �� ��å�� ���� N ��°�� ������ �մԿ��� ������ �� ��ȣ�� ����ϴ� ���α׷��̴�. ù ��° �մ��� 101 ȣ, �� ��° �մ��� 201 ȣ ��� ���� �����Ѵ�. �׸� 1 �� ��츦 ���� ���, H = 6�̹Ƿ� 10 ��° �մ��� 402 ȣ�� �����ؾ� �Ѵ�.

�Է�
���α׷��� ǥ�� �Է¿��� �Է� �����͸� �޴´�. ���α׷��� �Է��� T ���� �׽�Ʈ �����ͷ� �̷���� �ִµ� T �� �Է��� �� ù �ٿ� �־�����. �� �׽�Ʈ �����ʹ� �� �����μ� H, W, N, �� ������ �����ϰ� ������ ���� ȣ���� �� ��, �� ���� �� ��, �� ��° �մ������� ��Ÿ����(1 �� H, W �� 99, 1 �� N �� H �� W). 

���
���α׷��� ǥ�� ��¿� ����Ѵ�. �� �׽�Ʈ �����͸��� ��Ȯ�� �� ���� ����ϴµ�, ������ N ��° �մԿ��� �����Ǿ�� �ϴ� �� ��ȣ�� ����Ѵ�.

���� �Է� 1 
2
6 12 10
30 50 72
���� ��� 1 
402
1203
*/

import java.io.*;

class Main
{
	static String getAnswer(String dataSet){
		String data[] = dataSet.split(" ");
		int h = Integer.parseInt(data[0]);	// ��
		int w = Integer.parseInt(data[1]);	// ȣ��
		int n = Integer.parseInt(data[2]);	// N��° �մ�
		
		StringBuilder sb = new StringBuilder(); // YYXX ȣ
		if( n > h*w) return null;
		if(n % h == 0){	
			sb.append(h);
			if(n/h < 10){
				sb.append(0).append(n/h);
			}else sb.append(n/h);
		}else{
			sb.append(n % h);
			if(n/h + 1 < 10){
				sb.append(0).append(n/h + 1);
			}else{
				sb.append(n/h + 1);
			}
		}
		return sb.toString();
	}
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder answer = new StringBuilder();

		int testNumber = Integer.parseInt(br.readLine());
		for(int i=0; i< testNumber; i++){
			String dataSet = br.readLine();
			answer.append(getAnswer(dataSet)).append(System.lineSeparator());
		}
		bw.write(answer.toString());
		bw.flush();
		bw.close();
	}
}


/* �ٸ� ����� ��

	public static void main(String[] args) throws IOException{
		BufferedReader	br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder	sb = new StringBuilder();
		
		int	n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int floor = Integer.parseInt(st.nextToken());
			int	room = Integer.parseInt(st.nextToken());
			int	person = Integer.parseInt(st.nextToken());
			
			if (person % floor == 0) {
				sb.append((floor * 100) + (person / floor));
			}
			else {
				sb.append(((person % floor) * 100) + ((person / floor) + 1));
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

*/