/*
문제
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

입력
첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

출력
첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
*/

import java.io.*;

class Main
{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		//A 65 ~ Z 90
		line = line.toUpperCase();
		
		//알파벳 숫자세기
		int[] charCnt = new int[26];
		for(int i=0;i<line.length();i++){
			charCnt[(int)(line.charAt(i) - 'A')] += 1;
		}
		//많이 사용된 알파벳 회수
		int max = -1;
		for(int i=0;i<charCnt.length;i++){
			if( charCnt[i] > max) max = charCnt[i];
		}
		//많이 사용된 알파벳 출력
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