/*
����
�������� �ü������ ũ�ξ�Ƽ�� ���ĺ��� �Է��� ���� ������. ����, ������ ���� ũ�ξ�Ƽ�� ���ĺ��� �����ؼ� �Է��ߴ�.

ũ�ξ�Ƽ�� ���ĺ�	����
?	c=
?	c-
d?	dz=
��	d-
lj	lj
nj	nj
?	s=
?	z=
���� ���, ljes=njak�� ũ�ξ�Ƽ�� ���ĺ� 6��(lj, e, ?, nj, a, k)�� �̷���� �ִ�. �ܾ �־����� ��, �� ���� ũ�ξ�Ƽ�� ���ĺ����� �̷���� �ִ��� ����Ѵ�.

d?�� ������ �ϳ��� ���ĺ����� ���̰�, d�� ?�� �и��� ������ ���� �ʴ´�. lj�� nj�� ���������̴�. �� ��Ͽ� ���� ���ĺ��� �� ���ھ� ����.

�Է�
ù° �ٿ� �ִ� 100������ �ܾ �־�����. ���ĺ� �ҹ��ڿ� '-', '='�θ� �̷���� �ִ�.

�ܾ�� ũ�ξ�Ƽ�� ���ĺ����� �̷���� �ִ�. ���� ������ ǥ�� �����ִ� ���ĺ��� ����� ���·� �Էµȴ�.

���
�Է����� �־��� �ܾ �� ���� ũ�ξ�Ƽ�� ���ĺ����� �̷���� �ִ��� ����Ѵ�.
*/

import java.io.*;

class Main 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		line = line.replace("c=","x")
			.replace("c-","x")
			.replace("dz=","x")
			.replace("d-","x")
			.replace("lj","x")
			.replace("nj","x")
			.replace("s=","x")
			.replace("z=","x");

		System.out.println(line.length());
	}
}
