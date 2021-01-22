/*
����
�׷� �ܾ�� �ܾ �����ϴ� ��� ���ڿ� ���ؼ�, �� ���ڰ� �����ؼ� ��Ÿ���� ��츸�� ���Ѵ�. ���� ���, ccazzzzbb�� c, a, z, b�� ��� �����ؼ� ��Ÿ����, kin�� k, i, n�� �����ؼ� ��Ÿ���� ������ �׷� �ܾ�������, aabbbccb�� b�� �������� ��Ÿ���� ������ �׷� �ܾ �ƴϴ�.

�ܾ� N���� �Է����� �޾� �׷� �ܾ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �ܾ��� ���� N�� ���´�. N�� 100���� �۰ų� ���� �ڿ����̴�. ��° �ٺ��� N���� �ٿ� �ܾ ���´�. �ܾ�� ���ĺ� �ҹ��ڷθ� �Ǿ��ְ� �ߺ����� ������, ���̴� �ִ� 100�̴�.

���
ù° �ٿ� �׷� �ܾ��� ������ ����Ѵ�.
*/

/*
1. ù��° ����(0)�� �ܾ�� ã�´�
2-1. (1)�� �ƴϸ� �׷�ܾ� �ƴ�. >> break
2-2. ���ų�(-1), (1)
3. (0)�� ���ش�. substring(1)
4. length == 1 �̸� �׷�ܾ�
*/

import java.io.*;

class  Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int numberOfGroup = 0;
		String word = null;
		for(int j=0; j<num; j++){
			word = br.readLine();
			int firstL = word.length();
	
			for(int i=0; i < firstL ; i++){
				if(word.length()!= 1){
					int point = word.indexOf(word.charAt(0), 1);
					if( point != 1 && point != -1){
						break;		
					}else{
						word = word.substring(1);
					}
				}else{
					numberOfGroup++;
				}
			}
		}
		System.out.println(numberOfGroup);
	}
}

/* �ٸ������ Ǯ��
public class Main {
	//a -> 97
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine()), count = 0;
		for (int i = 0; i < N; i++) {
			boolean[] alpha = new boolean[26];
			char[] line = bf.readLine().toCharArray();
			alpha[line[0] - 97] = true;
			for (int j = 1; j < line.length; j++) {
				if (line[j] == line[j - 1])
					continue;
				else {
					int temp = line[j] - 97;
					
					if (alpha[temp]) {
						count--;
						break;
					} else
						alpha[temp] = true;
				}
			}

			count++;
		}

		System.out.println(count);
	}
}
*/