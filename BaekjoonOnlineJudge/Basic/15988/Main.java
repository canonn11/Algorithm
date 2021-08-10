import java.io.*;


public class Main {
    static long[] i = new long[1000001];

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        i[1]=1;
        i[2]=2;
        i[3]=4;
        for(int i=0; i<t; i++){
            int num = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(sumcount(num))+"\n");


        }
        br.close();
        bw.close();
    }
    public static long sumcount(int n){
        if(n<3){
            return i[n];
        }
        if(i[n]!=0){
            return i[n];
        }
        return i[n] = (sumcount(n-3)+sumcount(n-2)+sumcount(n-1))%1000000009;
    }
}