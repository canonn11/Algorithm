import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int gcd;
        int lcm;

        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            gcd = gcd(a,b);
            lcm = (a * b) / gcd;
            bw.write(String.valueOf(lcm)+"\n");

        }



        bw.close();
        br.close();

    }
    private static int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
}
