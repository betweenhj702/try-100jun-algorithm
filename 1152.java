/*����
���� ��ҹ��ڿ� ���⸸���� �̷���� ���ڿ��� �־�����. �� ���ڿ����� �� ���� �ܾ ������? �̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ��, �� �ܾ ���� �� �����ϸ� ������ Ƚ����ŭ ��� ����� �Ѵ�.

�Է�
ù �ٿ� ���� ��ҹ��ڿ� ����� �̷���� ���ڿ��� �־�����. �� ���ڿ��� ���̴� 1,000,000�� ���� �ʴ´�. �ܾ�� ���� �� ���� ���еǸ�, ������ �����ؼ� ������ ���� ����. ���� ���ڿ��� �հ� �ڿ��� ������ ���� ���� �ִ�.

���
ù° �ٿ� �ܾ��� ������ ����Ѵ�.*/
import java.io.*;
import java.util.StringTokenizer;

class  Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String sentence = br.readLine();
		StringTokenizer st = new StringTokenizer(sentence);
		int cnt = st.countTokens();
		bw.write(Integer.toString(cnt));
		bw.flush();
		bw.close();
		br.close();
	}
}

/* �ٸ� ����� ��

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int ascii;
        boolean space=true; 
        int result=0;
        while ((ascii=System.in.read()) > 13 ) {
        	if (ascii == 32 ) {
        		space = true;
        	}
        	if (ascii > 64) {
        		if (space) {
        			result++;
        			space=false;
        		}
        	}
        }
        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
    }    
}
*/