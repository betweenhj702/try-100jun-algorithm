/*
����
ī���뿡�� ���� �α� �ִ� ���� ������ ��Ģ�� ����� ����. ī���� ���� 21�� ���� �ʴ� �ѵ� ������, ī���� ���� �ִ��� ũ�� ����� �����̴�. ������ ī���븶�� �پ��� ������ �ִ�.

�ѱ� �ְ��� ���� ��� �������� ���ο� ���� ��Ģ�� ����� ���, â���̿� �����Ϸ��� �Ѵ�.

������ ������ ���迡�� �� ī�忡�� ���� ������ ���� �ִ�. �� ����, ������ N���� ī�带 ��� ���ڰ� ���̵��� �ٴڿ� ���´�. �׷� �Ŀ� ������ ���� M�� ũ�� ��ģ��.

���� �÷��̾�� ���ѵ� �ð� �ȿ� N���� ī�� �߿��� 3���� ī�带 ���� �Ѵ�. ���� ���� �����̱� ������, �÷��̾ �� ī���� ���� M�� ���� �����鼭 M�� �ִ��� ������ ������ �Ѵ�.

N���� ī�忡 ���� �ִ� ���ڰ� �־����� ��, M�� ���� �����鼭 M�� �ִ��� ����� ī�� 3���� ���� ���� ����Ͻÿ�.

�Է�
ù° �ٿ� ī���� ���� N(3 �� N �� 100)�� M(10 �� M �� 300,000)�� �־�����. ��° �ٿ��� ī�忡 ���� �ִ� ���� �־�����, �� ���� 100,000�� ���� �ʴ� ���� �����̴�.

���� M�� ���� �ʴ� ī�� 3���� ã�� �� �ִ� ��츸 �Է����� �־�����.

���
ù° �ٿ� M�� ���� �����鼭 M�� �ִ��� ����� ī�� 3���� ���� ����Ѵ�.

sol)
1. �迭�� ����� �־��� ���ڸ� �Է��ϰ� 
2. �迭���� 3���� ������ ���ϰ� M�� �����ʴ� ���� �ִ밪 ������ �����Ѵ�.
    2-1) (0,1,2 ....) (0,2,3 ....) �̷������� �ݺ����� ¥�� ��� ���� �˻��� �� �ִ�.
    2-2) ������ �˻� ���̽��� (N-2, N-1, N) �̴�
3. �ݺ��ϸ鼭 �ִ밪�� ���Ѵ�.

*/
import java.io.*;
import java.util.StringTokenizer;

class Main2798 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] caseNum = br.readLine().split(" ");
        int N = Integer.parseInt(caseNum[0]);
        int M = Integer.parseInt(caseNum[1]);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] cardNum = new int[N];
        for(int i=0; i < N; i++){
            cardNum[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(getMaxNum(N, M, cardNum));
    }

    static int getMaxNum(int N, int M, int[] cardNum){
        int maxNum = 0;
        int tempSum = 0;
        for(int i = 0; i < N-2; i++){
            for(int j = i + 1; j < N-1; j++){
                for(int k = j + 1; k < N; k++){
                    tempSum = cardNum[i] + cardNum[j] + cardNum[k];
                    if(tempSum <= M && tempSum > maxNum){
                        maxNum = tempSum;
                    }        
                }
            }
        }
        return maxNum;
    }
}
