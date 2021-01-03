/*
����
���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. ��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.

�Է�
ù° �ٿ� ���ĺ� ��ҹ��ڷ� �̷���� �ܾ �־�����. �־����� �ܾ��� ���̴� 1,000,000�� ���� �ʴ´�.

���
ù° �ٿ� �� �ܾ�� ���� ���� ���� ���ĺ��� �빮�ڷ� ����Ѵ�. ��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�.
*/

import java.io.*;

class Main
{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		//A 65 ~ Z 90
		line = line.toUpperCase();
		
		//���ĺ� ���ڼ���
		int[] charCnt = new int[26];
		for(int i=0;i<line.length();i++){
			charCnt[(int)(line.charAt(i) - 'A')] += 1;
		}
		//���� ���� ���ĺ� ȸ��
		int max = -1;
		for(int i=0;i<charCnt.length;i++){
			if( charCnt[i] > max) max = charCnt[i];
		}
		//���� ���� ���ĺ� ���
		int cnt = 0;
		char maxChar = 0;
		for(int i=0;i<charCnt.length;i++){
			if(max == charCnt[i]){
				cnt += 1;
				maxChar = (char)(i + 'A');
			}
		}
		if(cnt == 1){
			System.out.println(maxChar);	
		}else{
			System.out.println("?");
		}
	}
}