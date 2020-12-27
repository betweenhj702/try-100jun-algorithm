import java.io.*;

class Main
{
	static int cnt;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		hansu(number);
	}

	static void hansu(int number){
		for(int i=1;i<=number;i++){
			if(i<100){
				cnt++;
			}else if(i<=1000){
				int a = i/100;
				int b = i%100/10;
				int c = i%100%10;
				if(a-b == b-c){
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
