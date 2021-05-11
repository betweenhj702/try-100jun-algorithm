
/*
����
�츮�� ����� ��ġ�� Ű�� ������, �� �� ���� ������ ǥ���Ͽ� �� ����� �Űܺ����� �Ѵ�. � ����� �����԰� x kg�̰� Ű�� y cm��� �� ����� ��ġ�� (x, y)�� ǥ�õȴ�. �� ��� A �� B�� ��ġ�� ���� (x, y), (p, q)��� �� �� x > p �׸��� y > q �̶�� �츮�� A�� ��ġ�� B�� ��ġ���� "�� ũ��"�� ���Ѵ�. ���� ��� � A, B �� ����� ��ġ�� ���� (56, 177), (45, 165) ��� �Ѵٸ� A�� ��ġ�� B���� ū ���� �ȴ�. �׷��� ���� �ٸ� ��ġ���� ũ�⸦ ���� �� ���� ��쵵 �ִ�. ���� ��� �� ��� C�� D�� ��ġ�� ���� (45, 181), (55, 173)�̶�� �����Դ� D�� C���� �� ���̰�, Ű�� C�� �� ũ�Ƿ�, "��ġ"�θ� �� �� C�� D�� ������ ���溸�� �� ũ�ٰ� ���� �� ����.

N���� ���ܿ��� �� ����� ��ġ ����� �ڽź��� �� "ū ��ġ"�� ����� ���� ��������. ���� �ڽź��� �� ū ��ġ�� ����� k���̶�� �� ����� ��ġ ����� k+1�� �ȴ�. �̷��� ����� �����ϸ� ���� ��ġ ����� ���� ����� ���� �� �����ϴ�. �Ʒ��� 5������ �̷���� ���ܿ��� �� ����� ��ġ�� �� ����� ǥ�õ� ǥ�̴�.

�̸�	(������, Ű)	��ġ ���
A	(55, 185)	2
B	(58, 183)	2
C	(88, 186)	1
D	(60, 175)	2
E	(46, 155)	5
�� ǥ���� C���� �� ū ��ġ�� ����� �����Ƿ� C�� 1���� �ȴ�. �׸��� A, B, D ������ ��ġ���� ū ����� C���̹Ƿ� �̵��� ��� 2���� �ȴ�. �׸��� E���� ū ��ġ�� A, B, C, D �̷��� 4���̹Ƿ� E�� ��ġ�� 5���� �ȴ�. �� ��쿡 3��� 4���� �������� �ʴ´�. �������� �л� N���� �����Կ� Ű�� ��� �Է��� �о �� ����� ��ġ ����� ����Ͽ� ����ؾ� �Ѵ�.

�Է�
ù �ٿ��� ��ü ����� �� N�� �־�����. �׸��� �̾����� N���� �ٿ��� �� ����� �����Կ� Ű�� ��Ÿ���� ���� ���� x�� y�� �ϳ��� ������ �ΰ� ���� ��Ÿ����.

���
�������� �Է¿� ������ ����� ��ġ ����� ���ؼ� �� ������� ù �ٿ� ����ؾ� �Ѵ�. ��, �� ��ġ ����� ���鹮�ڷ� �и��Ǿ�� �Ѵ�.

sol)
1. Ű�� ������ �迭 ���� ������� �Է�
2. ��� �迭�� ����� 
3. ����� ���? �ڱ⺸�� ū ��� �� + 1

*/
import java.io.*;
import java.util.*;

class Main7568 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(br.readLine());
        int[] height = new int[caseNum];
        int[] weight = new int[caseNum];
        int[] order = new int[caseNum];
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<caseNum; i++){   // �Է��� ������, Ű �迭�� ����
            StringTokenizer st = new StringTokenizer(br.readLine());
            weight[i] = Integer.parseInt(st.nextToken());
            height[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<caseNum; i++){   // ���Ͽ� ����� ���Ͽ� �迭�� ����
            int tempOrder = 1;
            for(int j=0; j<caseNum; j++){
                if(weight[i] < weight[j] && height[i]< height[j]){
                    tempOrder++;
                }
            }
            order[i] = tempOrder;
            sb.append(order[i]).append(" ");
        }

        System.out.println(sb.toString());
    }
}

/*
    �ٸ� ����� Ǯ��: 2���� �迭�� �̿���
    arr[0][] �� ������
    arr[1][] �� Ű
    arr[2][] �� ���
    �� �������

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[3][N];
		
		for(int i = 0 ; i < N ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0 ; j < 2 ; j++) {
				arr[j][i] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0 ; i < N-1 ; i++) {
			for(int j = i+1 ; j < N ; j++) {
				if(arr[0][i] > arr[0][j] && arr[1][i] > arr[1][j]) {
					arr[2][j] += 1;
				} else if(arr[0][i] < arr[0][j] && arr[1][i] < arr[1][j]) {
					arr[2][i] += 1;
				}
			}
		}
		
		for(int i = 0 ; i < N ; i++) {
			sb.append(arr[2][i] + 1).append(" ");
		}
		System.out.println(sb);
    }
*/