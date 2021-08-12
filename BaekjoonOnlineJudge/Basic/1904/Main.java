import java.io.*;

public class Main {
    static int dp[] = new int[1000001];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(func(n)));

        bw.close();
        br.close();
    }

    static int func(int n) {
        if (dp[n] != 0) {
            return dp[n];
        }
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        return dp[n] = (func(n - 1) + func(n - 2))%15746;
    }
}
