import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n-m];
        int j=0;
        int sum=0;
        int min;
        if(m!=n){
            for(int i=m; i<=n; i++){
                if(isprimenumber(i)==1){
                    arr[j] = i;
                    j++;
                }
            }
            for(int k=0; k<n-m; k++){
                sum = sum + arr[k];
            }
            if(!(arr[0] >=m && arr[0] <=n)){
                bw.write("-1");
            }
            else{
                min = arr[0];
                bw.write(String.valueOf(sum)+"\n");
                bw.write(String.valueOf(min)+"\n");
            }
        }
        else{
            if(isprimenumber(m)==1){
                bw.write(String.valueOf(m)+"\n");
                bw.write(String.valueOf(m)+"\n");
            }
            else{
                bw.write("-1");
            }
        }
        bw.close();
        br.close();
    }

    private static int isprimenumber(int n){
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