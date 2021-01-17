/*
������� �ҸӴϴ� �Ʒ� �׸��� ���� ������ ���̾� ��ȭ�⸦ ����Ѵ�.

ABC	DEF	GHI	JKL	MNO	PQRS TUV WXYZ
2	3	4	5	6	7	8	9

��ȭ�� �ɰ� ���� ��ȣ�� �ִٸ�, ���ڸ� �ϳ��� ���� ������ �ݼ� ���� �ִ� �� ���� �ð�������� ������ �Ѵ�. ���ڸ� �ϳ� ������ ���̾��� ó�� ��ġ�� ���ư���, ���� ���ڸ� �������� ���̾��� ó�� ��ġ���� �ٽ� ������ �Ѵ�.

���� 1�� �ɷ��� �� 2�ʰ� �ʿ��ϴ�. 1���� ū ���� �Ŵµ� �ɸ��� �ð��� �̺��� �� �ɸ���, �� ĭ ���� �ִ� ���ڸ� �ɱ� ���ؼ� 1�ʾ� �� �ɸ���.

������� �ҸӴϴ� ��ȭ ��ȣ�� �� ���ڿ� �ش��ϴ� ���ڷ� �ܿ��. ��, � �ܾ �� ��, �� ���ĺ��� �ش��ϴ� ���ڸ� �ɸ� �ȴ�. ���� ���, UNUCIC�� 868242�� ����.

�ҸӴϰ� �ܿ� �ܾ �־����� ��, �� ��ȭ�� �ɱ� ���ؼ� �ʿ��� �ּ� �ð��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ���ĺ� �빮�ڷ� �̷���� �ܾ �־�����. �ܾ��� ���̴� 2���� ũ�ų� ����, 15���� �۰ų� ����.

���
ù° �ٿ� ���̾��� �ɱ� ���ؼ� �ʿ��� �ּ� �ð��� ����Ѵ�.
*/

import java.io.*;

class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int total = 0;
		for(int i=0; i<line.length(); i++){
			String oneChar = line.substring(i,i+1);
			int oneSec = 2;
			if(oneChar.equals("A")||oneChar.equals("B")||oneChar.equals("C")){
				oneSec += 1;
			}else if(oneChar.equals("D")||oneChar.equals("E")||oneChar.equals("F")){
				oneSec += 2;
			}else if(oneChar.equals("G")||oneChar.equals("H")||oneChar.equals("I")){
				oneSec += 3;
			}else if(oneChar.equals("J")||oneChar.equals("K")||oneChar.equals("L")){
				oneSec += 4;
			}else if(oneChar.equals("M")||oneChar.equals("N")||oneChar.equals("O")){
				oneSec += 5;
			}else if(oneChar.equals("P")||oneChar.equals("Q")||oneChar.equals("R")||oneChar.equals("S")){
				oneSec += 6;
			}else if(oneChar.equals("T")||oneChar.equals("U")||oneChar.equals("V")){
				oneSec += 7;
			}else if(oneChar.equals("W")||oneChar.equals("X")||oneChar.equals("Y")||oneChar.equals("Z")){
				oneSec += 8;
			}
			
			total += oneSec;
			
		}
		System.out.println(total);
	}
}
/*
�ٸ� ����� ��

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) >= 'A' && S.charAt(i) <= 'C')
				Cnt += 3;
			else if (S.charAt(i) >= 'D' && S.charAt(i) <= 'F')
				Cnt += 4;
			else if (S.charAt(i) >= 'G' && S.charAt(i) <= 'I')
				Cnt += 5;
			else if (S.charAt(i) >= 'J' && S.charAt(i) <= 'L')
				Cnt += 6;
			else if (S.charAt(i) >= 'M' && S.charAt(i) <= 'O')
				Cnt += 7;
			else if (S.charAt(i) >= 'P' && S.charAt(i) <= 'S')
				Cnt += 8;
			else if (S.charAt(i) >= 'T' && S.charAt(i) <= 'V')
				Cnt += 9;
			else if (S.charAt(i) >= 'W' && S.charAt(i) <= 'Z')
				Cnt += 10;
		}
*/