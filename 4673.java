import java.util.TreeSet;

class Main 
{
	TreeSet<Integer> v = new TreeSet<Integer>();
	Main(){
		for(int i=1;i<10000;i++){
			v.add(i);
		}
	}
	
	int result;
	int d(int n){
		if(n<10){
			result = n + n%10;
		}else if(n<100){
			result = n + n/10 + n%10;
		}else if(n<1000){
			result = n + n/100 + n%100/10 + n%100%10;
		}else if(n<10000){
			result = n + n/1000 + n%1000/100 + n%1000%100/10 + n%1000%100%10;
		}

		if(result < 10000){
			if(v.contains(result)){
				v.remove(result);
			}	
			d(result);
		}
		return result;
	}

	public static void main(String[] args) {
		Main m = new Main();
		for(int i=1;i<10000;i++){
			 m.d(i);
		}
		for(int i: m.v) System.out.println(i);
	}
}
