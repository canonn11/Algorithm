import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int arr[] = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++){
            int temp = Integer.parseInt(st.nextToken());
            if(temp > s){
                arr[i] = temp-s;
            }
            else{
                arr[i] = s - temp;
            }
        }
        Arrays.sort(arr);
        for(int j=0; j<arr.length-1; j++){
            arr[j+1] = gcd(arr[j],arr[j+1]);
        }

        bw.write(String.valueOf(arr[arr.length-1]));
        bw.close();
        br.close();
    }

    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
}