import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for(int i=a; i<=b; i++){
            if(primenumber(i)!=0){
                bw.write(String.valueOf(i)+"\n");
            }
        }
        bw.close();
        br.close();
    }
    private static int primenumber(int n){
        if(n==1){
            return 0;
        }
        else{
            for(int i=2; i*i<=n; i++){
                if(n%i ==0){
                    return 0;
                }
            }
            return 1;
        }
    }
}