
import java.io.*;
import java.util.StringTokenizer;

class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int j=0; j<num; j++){
			
			String[] scoreStr = br.readLine().split(" ");
			int stuNum = Integer.parseInt(scoreStr[0]);
			int sum = 0;
			for(int i=1; i<scoreStr.length; i++){
				int score = Integer.parseInt(scoreStr[i]);
				sum += score;
			}
			double avg = (double)sum / stuNum ;
			
			double cnt = 0;
			for(int i=1; i<scoreStr.length; i++){
				int score = Integer.parseInt(scoreStr[i]);
				if( score>avg ) cnt++;
			}
			double ratio = (cnt / stuNum)*100;
			System.out.println( String.format("%.3f",ratio)+"%");

		}
	}
	
}
