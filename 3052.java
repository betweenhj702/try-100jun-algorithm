import java.io.*;

class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int namuji[] = new int[42];
		String line = null;
		while((line = br.readLine())!= null){
			int i = Integer.parseInt(line);
			namuji[i%42] += 1;
		}
		int cnt = 0;
		for(int i: namuji){
			if(i!=0) cnt++;
		}
		System.out.println(cnt);
	}
}
