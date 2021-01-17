/*문제
영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.

입력
첫 줄에 영어 대소문자와 띄어쓰기로 이루어진 문자열이 주어진다. 이 문자열의 길이는 1,000,000을 넘지 않는다. 단어는 띄어쓰기 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열의 앞과 뒤에는 공백이 있을 수도 있다.

출력
첫째 줄에 단어의 개수를 출력한다.*/
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

/* 다른 사람의 답

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