import java.io.*;

public class Main {
    static long dp[] = new long[101];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(func(n))+"\n");
        }

        bw.close();
        br.close();
    }

    static long func(int n) {
        if (dp[n] != 0) {
            return dp[n];
        }
        if(n<=3){
            return 1;
        }
        return dp[n] = (func(n - 2) + func(n - 3));
    }
}
