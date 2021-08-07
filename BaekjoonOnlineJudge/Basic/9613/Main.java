import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        long gcdsum = 0;
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            st = new StringTokenizer(br.readLine());
            int temp = Integer.parseInt(st.nextToken());
            long arr[] = new long[temp];
            int j=0;
            while(st.hasMoreTokens()){
                arr[j] = Long.parseLong(st.nextToken());
                j++;
            }
            for(int k=0; k<temp; k++){
                for(int l=k+1; l<temp; l++){
                    gcdsum += gcd(arr[k],arr[l]);
                }
            }
            bw.write(String.valueOf(gcdsum)+"\n");
            gcdsum = 0;
        }
        bw.close();
        br.close();
    }
    public static long gcd(long a, long b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
}