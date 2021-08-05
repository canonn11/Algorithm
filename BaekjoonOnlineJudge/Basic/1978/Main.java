import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int count = 0;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            int number = Integer.parseInt(st.nextToken());
            if(primenumber(number)!=0){
                count++;
            }
        }
        bw.write(String.valueOf(count));
        bw.close();
        br.close();
    }
    private static int primenumber(int n){
        if(n==1){
            return 0;
        }
        else{
            for(int i=2; i<n; i++){
                if(n%i ==0){
                    return 0;
                }
            }
            return 1;
        }
    }
}