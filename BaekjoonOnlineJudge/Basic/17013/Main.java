import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] isPrime = new boolean[1000001];
        Arrays.fill(isPrime, true);
        for (int i = 2; i < 1000; i++) {
            if (!isPrime[i])
                continue;
            for (int j = 2; i * j < 1000001; j++)
                isPrime[i * j] = false;
        }


        int count=0;
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            int n1 = (n / 2) - 1;
            int n2 = (n / 2) + 1;
            if (n == 4 || n == 6) {
                n1 = n / 2;
                n2 = n / 2;
                count++;
            }
            else{
                while(n1>1){
                    if ((n1 % 2) == 0 && (n2 % 2 == 0)) {
                        if ((n1 + 1) == (n2 - 1) && isPrime[n1 + 1]) {
                            n1 = n / 2;
                            n2 = n / 2;
                            count++;
                        } else {
                            n1 -= 1;
                            n2 += 1;
                        }
                    }
                    else if (isPrime[n1] && isPrime[n2]) {
                        count++;
                    }
                    n1 -= 2;
                    n2 += 2;
                }
            }
            bw.write(String.valueOf(count)+"\n");
            count = 0;
        }
        bw.close();
        br.close();
    }

}