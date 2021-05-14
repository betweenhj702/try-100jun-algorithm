/*
    문제
지민이는 자신의 저택에서 MN개의 단위 정사각형으로 나누어져 있는 M*N 크기의 보드를 찾았다. 어떤 정사각형은 검은색으로 칠해져 있고, 나머지는 흰색으로 칠해져 있다. 지민이는 이 보드를 잘라서 8*8 크기의 체스판으로 만들려고 한다.

체스판은 검은색과 흰색이 번갈아서 칠해져 있어야 한다. 구체적으로, 각 칸이 검은색과 흰색 중 하나로 색칠되어 있고, 변을 공유하는 두 개의 사각형은 다른 색으로 칠해져 있어야 한다. 따라서 이 정의를 따르면 체스판을 색칠하는 경우는 두 가지뿐이다. 하나는 맨 왼쪽 위 칸이 흰색인 경우, 하나는 검은색인 경우이다.

보드가 체스판처럼 칠해져 있다는 보장이 없어서, 지민이는 8*8 크기의 체스판으로 잘라낸 후에 몇 개의 정사각형을 다시 칠해야겠다고 생각했다. 당연히 8*8 크기는 아무데서나 골라도 된다. 지민이가 다시 칠해야 하는 정사각형의 최소 개수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N과 M이 주어진다. N과 M은 8보다 크거나 같고, 50보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에는 보드의 각 행의 상태가 주어진다. B는 검은색이며, W는 흰색이다.

출력
첫째 줄에 지민이가 다시 칠해야 하는 정사각형 개수의 최솟값을 출력한다.

sol) 
1. 주어진 BW칸에서 8*8로 만들었을 때, BWBW.... 번갈아 나오게 할 때, 바꾸는 글자가 최소인 경우를 고른다.
2. 2차원 배열을 이용해서 예시 입력값을 저장하고 (0,0)에서부터 검사하여 조건에 틀릴 경우 글자를 바꾼다.
3. 바꾸는 글자를 카운터
4. 최소로 바꾸는 경우를 출력한다.
*/

import java.io.*;

class Main1018 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] caseStr = br.readLine().split(" ");
        int N = Integer.parseInt(caseStr[0]);
        int M = Integer.parseInt(caseStr[1]);
        String[][] board = new String[N][M];
        for(int i=0; i<N; i++){ // 주어진 예시를 이차원 배열에 입력한다.
            String line = br.readLine();
            for(int j=0; j<M; j++){
                board[i][j] = line.substring(j,j+1);
            }
        }
        
        // 모든 경우를 검사하고 최소로 변경된 값을 출력한다.
        int answer = 9999;
        for(int i=0; i< N-7; i++){
            for(int j=0; j< M-7; j++){
                int temp = checkBoard(board, i, j, N, M);
                if(temp < answer) answer = temp;
            }
        }
        System.out.println(answer);
    }
    // 8*8을 검사하는 메소드 필요  
    static int checkBoard(String[][] board, int startI, int startJ, int N, int M){
        int endI = startI + 8;
        int endJ = startJ + 8;
        int count = 0;
         // tempBoard = board 로 정의하면 안된다... 참조값을 대입하므로 같은 객체가 되어버림.
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
        // 첫번째 칸의 색깔을 바꾸어 칠하는 경우 == (64-count)
        count = Math.min(count, 64 - count);
        return count;
    }
}
