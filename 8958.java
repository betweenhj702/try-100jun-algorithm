import java.io.*;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		for(int j=0;j<num;j++){
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line, "X");
			int score = 0;
			while(st.hasMoreTokens()){
				String o = st.nextToken();
				int oNum = o.length();
				for(int i=1;i<=oNum;i++) score += i;
			}
			System.out.println(score);
		}
	}
}
