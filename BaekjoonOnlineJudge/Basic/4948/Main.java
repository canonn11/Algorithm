import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count=0;
        while(n!=0){
            int n2= 2*n;
            for(int i=n+1; i<=n2; i++){
                if(isprime(i)==1){
                    count++;
                }
            }
            bw.write(String.valueOf(count)+"\n");
            count=0;
            n = Integer.parseInt(br.readLine());
        }

        bw.close();
        br.close();
    }
    private static int isprime(int n){
        if(n==1){
            return 0;
        }
        else{
            for(int i=2; i*i<=n; i++){
                if(n% i ==0){
                    return 0;
                }
            }
            return 1;
        }
    }
}