import java.io.*;
import java.util.StringTokenizer;
public class Main {
    static int dp[][];
    static int cost[][];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        dp = new int[t][3];
        cost = new int[t][3];
        for(int i=0; i<t; i++){
            st = new StringTokenizer(br.readLine());
            //red
            cost[i][0] = Integer.parseInt(st.nextToken());
            //green
            cost[i][1] = Integer.parseInt(st.nextToken());
            //blue
            cost[i][2] = Integer.parseInt(st.nextToken());
        }
        dp[0][0] = cost[0][0];
        dp[0][1] = cost[0][1];
        dp[0][2] = cost[0][2];
        bw.write(String.valueOf(Math.min(paint(t-1,0),Math.min(paint(t-1,1),paint(t-1,2)))));

        bw.close();
        br.close();
    }

    static int paint(int t, int color) {
        if(dp[t][color]==0){
            if(color==0){
                dp[t][0] = Math.min(paint(t-1,1),paint(t-1,2)) + cost[t][0];
            }
            else if(color==1){
                dp[t][1] = Math.min(paint(t-1,0),paint(t-1,2)) + cost[t][1];
            }
            else if(color==2){
                dp[t][2] = Math.min(paint(t-1,0),paint(t-1,1)) + cost[t][2];
            }
        }
        return dp[t][color];
    }
}
