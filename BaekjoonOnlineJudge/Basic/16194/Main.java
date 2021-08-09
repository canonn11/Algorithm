import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    static Integer arr[];
    static Integer dp[];
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        arr = new Integer[n+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp = new Integer[n+1];
        Arrays.fill(dp, 10001);
        dp[0]=0;
        dp[1] = arr[1];
        bw.write(String.valueOf(minvalue(n)));

        br.close();
        bw.close();
    }
    public static int minvalue(int n){
        if(n==1){
            return dp[1];
        }
        for(int i=0; i<n; i++){
            if(dp[i]!=10001){
                dp[n] = Math.min(dp[n],dp[i]+arr[n-i]);
            }
            else{
                dp[n] = Math.min(dp[n],minvalue(i)+arr[n-i]);
            }
        }
        return dp[n];
    }
}