import java.io.IOException;
import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String temp;
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                temp = st.nextToken();
                StringBuilder sb = new StringBuilder(temp).reverse();
                bw.write(sb.toString());

                bw.write(" ");
            }
            bw.write("\n");
        }
        br.close();
        bw.close();


    }
}
