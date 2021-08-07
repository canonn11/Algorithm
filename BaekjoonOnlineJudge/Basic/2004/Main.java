import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Integer.parseInt(st.nextToken());
        long m = Integer.parseInt(st.nextToken());
        long count2=0;
        long count5=0;

        count5 = count(n,5)-count(n-m,5)-count(m,5);
        count2 = count(n,2)-count(n-m,2)-count(m,2);
        if(count5 > count2){
            bw.write(String.valueOf(count2));
        }
        else{
            bw.write(String.valueOf(count5));
        }

        bw.close();
        br.close();
    }

    public static long count(long k,long div){
        long count=0;

        while(k>=div){
            count = count + k/div;
            k = k/div;
        }
        return count;
    }
}