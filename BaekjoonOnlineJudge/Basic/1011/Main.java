import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int countx=0;
        int county = 0;
        int j=0;
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            while(true){
                j++;

                x = x + j;
                countx++;
                if(x>=y){
                    break;
                }
                y = y - j;
                county++;
                if(y<=x){
                    break;
                }
            }

            bw.write(String.valueOf(countx+county)+"\n");

            countx=0;
            county=0;
            j=0;

        }
        br.close();
        bw.close();
    }
}
