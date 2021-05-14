/*
    ����
�����̴� �ڽ��� ���ÿ��� MN���� ���� ���簢������ �������� �ִ� M*N ũ���� ���带 ã�Ҵ�. � ���簢���� ���������� ĥ���� �ְ�, �������� ������� ĥ���� �ִ�. �����̴� �� ���带 �߶� 8*8 ũ���� ü�������� ������� �Ѵ�.

ü������ �������� ����� �����Ƽ� ĥ���� �־�� �Ѵ�. ��ü������, �� ĭ�� �������� ��� �� �ϳ��� ��ĥ�Ǿ� �ְ�, ���� �����ϴ� �� ���� �簢���� �ٸ� ������ ĥ���� �־�� �Ѵ�. ���� �� ���Ǹ� ������ ü������ ��ĥ�ϴ� ���� �� �������̴�. �ϳ��� �� ���� �� ĭ�� ����� ���, �ϳ��� �������� ����̴�.

���尡 ü����ó�� ĥ���� �ִٴ� ������ ���, �����̴� 8*8 ũ���� ü�������� �߶� �Ŀ� �� ���� ���簢���� �ٽ� ĥ�ؾ߰ڴٰ� �����ߴ�. �翬�� 8*8 ũ��� �ƹ������� ��� �ȴ�. �����̰� �ٽ� ĥ�ؾ� �ϴ� ���簢���� �ּ� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� N�� M�� �־�����. N�� M�� 8���� ũ�ų� ����, 50���� �۰ų� ���� �ڿ����̴�. ��° �ٺ��� N���� �ٿ��� ������ �� ���� ���°� �־�����. B�� �������̸�, W�� ����̴�.

���
ù° �ٿ� �����̰� �ٽ� ĥ�ؾ� �ϴ� ���簢�� ������ �ּڰ��� ����Ѵ�.

sol) 
1. �־��� BWĭ���� 8*8�� ������� ��, BWBW.... ������ ������ �� ��, �ٲٴ� ���ڰ� �ּ��� ��츦 ����.
2. 2���� �迭�� �̿��ؼ� ���� �Է°��� �����ϰ� (0,0)�������� �˻��Ͽ� ���ǿ� Ʋ�� ��� ���ڸ� �ٲ۴�.
3. �ٲٴ� ���ڸ� ī����
4. �ּҷ� �ٲٴ� ��츦 ����Ѵ�.
*/

import java.io.*;

class Main1018 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] caseStr = br.readLine().split(" ");
        int N = Integer.parseInt(caseStr[0]);
        int M = Integer.parseInt(caseStr[1]);
        String[][] board = new String[N][M];
        for(int i=0; i<N; i++){ // �־��� ���ø� ������ �迭�� �Է��Ѵ�.
            String line = br.readLine();
            for(int j=0; j<M; j++){
                board[i][j] = line.substring(j,j+1);
            }
        }
        
        // ��� ��츦 �˻��ϰ� �ּҷ� ����� ���� ����Ѵ�.
        int answer = 9999;
        for(int i=0; i< N-7; i++){
            for(int j=0; j< M-7; j++){
                int temp = checkBoard(board, i, j, N, M);
                if(temp < answer) answer = temp;
            }
        }
        System.out.println(answer);
    }
    // 8*8�� �˻��ϴ� �޼ҵ� �ʿ�  
    static int checkBoard(String[][] board, int startI, int startJ, int N, int M){
        int endI = startI + 8;
        int endJ = startJ + 8;
        int count = 0;
         // tempBoard = board �� �����ϸ� �ȵȴ�... �������� �����ϹǷ� ���� ��ü�� �Ǿ����.
        String[][] tempBoard = new String[N][M];
        for(int i=0; i<N; i++){ 
            for(int j=0; j<M; j++){
                tempBoard[i][j] = board[i][j];
            }
        }
        for(int i= startI; i< endI; i++){
            for(int j= startJ; j< endJ; j++){
                if(j == (endJ - 1)) break;
                if(tempBoard[i][j+1].equals(tempBoard[i][j])){
                    if(tempBoard[i][j].equals("B")) tempBoard[i][j+1] = "W";
                    else tempBoard[i][j+1] = "B";
                    count++;
                }    
            }
            if(i==(endI - 1)) break;
            if(tempBoard[i+1][startJ].equals(tempBoard[i][startJ])){
                if(tempBoard[i][startJ].equals("B")) tempBoard[i+1][startJ] = "W";
                else tempBoard[i+1][startJ] = "B";
                count++;
            }
        }
        // ù��° ĭ�� ������ �ٲپ� ĥ�ϴ� ��� == (64-count)
        count = Math.min(count, 64 - count);
        return count;
    }
}
