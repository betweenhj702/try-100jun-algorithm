/*
문제
땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.

달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.

달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)

출력
첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.
*/

import java.io.*;

class Main
{
	public static int getAnswer(int A, int B, int V){
		int lengthExceptLastDay = V-A;
		int dayToClimb = lengthExceptLastDay/(A-B);
		if( lengthExceptLastDay%(A-B) != 0){
			dayToClimb++;
		}
		dayToClimb += 1;
		return dayToClimb;
	}
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputStr = br.readLine().split(" ");
		int A = Integer.parseInt(inputStr[0]);
		int B = Integer.parseInt(inputStr[1]);
		int V = Integer.parseInt(inputStr[2]);
		System.out.println(getAnswer(A,B,V));
		
	}
}
