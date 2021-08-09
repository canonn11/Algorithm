import java.io.*;


public class Main {
    static Integer[] i;
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        i = new Integer[n+1];
        i[0]=1;
        i[1]=1;
        bw.write(String.valueOf(tile(n)));

        bw.close();
        br.close();
    }
    public static int tile(int n){
        if(i[n] !=null){
            return i[n];
        }
        return i[n] = ((tile(n-2)*2)+tile(n-1)) % 10007;
    }
}