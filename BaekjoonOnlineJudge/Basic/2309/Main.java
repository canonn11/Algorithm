import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int temp=0;
        int a=0;
        int b=0;
        int arr[] = new int[9];
        for(int i=0; i<9; i++){
            arr[i] = Integer.parseInt(br.readLine());
            temp = temp + arr[i];
        }
        Arrays.sort(arr);
        int sum = temp;
        for(int j=0; j<9; j++){
            for(int k=0; k<9; k++){
                if(j==k){
                    continue;
                }
                else{
                    sum = sum - arr[j]-arr[k];
                    if(sum==100){
                        a = j;
                        b = k;
                        break;
                    }
                }
                sum = temp;
            }
        }
        for(int l=0; l<9; l++){
            if(l==a || l==b){
                continue;
            }
            else{
                bw.write(String.valueOf(arr[l])+"\n");
            }
        }
        bw.close();
        br.close();
    }
}
