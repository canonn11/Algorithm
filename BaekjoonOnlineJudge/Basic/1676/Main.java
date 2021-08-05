import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());
        BigInteger result=BigInteger.ONE;

        for(int i=1; i<=number; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        String temp = String.valueOf(result);
        int count=0;
        for(int i=temp.length()-1; i>=0; i--){
            if(temp.charAt(i)=='0'){
                count++;
            }
            else if(temp.charAt(i) !='0'){
                break;
            }
        }
        bw.write(String.valueOf(count));
        bw.close();
        br.close();
    }
}