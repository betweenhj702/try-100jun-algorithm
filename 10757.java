import java.io.*;
import java.math.BigInteger;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] bigInt = br.readLine().split(" ");
        BigInteger a = new BigInteger(bigInt[0]);
        BigInteger b = new BigInteger(bigInt[1]);
        
        System.out.println(a.add(b).toString());
    }
}