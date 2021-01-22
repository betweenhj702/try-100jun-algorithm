/*
문제
그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.

출력
첫째 줄에 그룹 단어의 개수를 출력한다.
*/

/*
1. 첫번째 문자(0)을 단어에서 찾는다
2-1. (1)이 아니면 그룹단어 아님. >> break
2-2. 없거나(-1), (1)
3. (0)을 없앤다. substring(1)
4. length == 1 이면 그룹단어
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

/* 다른사람의 풀이
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