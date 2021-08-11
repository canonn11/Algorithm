import java.io.*;

public class Main {
    static int arr0[] = new int[41];
    static int arr1[] = new int[41];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        arr0[0]=1;
        arr0[1]=0;
        arr1[0]=0;
        arr1[1]=1;
        for(int i=0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            for(int j=2; j<41; j++){
                arr0[j] = arr0[j-1]+arr0[j-2];
                arr1[j] = arr1[j-1]+arr1[j-2];
            }
            bw.write(String.valueOf(arr0[n])+" "+String.valueOf(arr1[n])+"\n");
        }
        bw.close();
        br.close();
    }

}
