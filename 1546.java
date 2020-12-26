import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		float jumsu[] = new float[num];
		
		String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line);
		int i = 0;
		while(st.hasMoreTokens()){
			jumsu[i] = Integer.parseInt(st.nextToken());
			i++;	
		}
		
		Arrays.sort(jumsu);
		int max = (int) jumsu[num-1];
		float sum = 0f;
		for(float j: jumsu){
			j = j/max*100;
			sum += j;
		}
		System.out.println(sum/num);
	}
}
