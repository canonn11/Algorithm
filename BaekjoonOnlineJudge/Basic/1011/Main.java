import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count=0;
        int j=1;
        int fact=0;
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            while((x + fact) < (y - 1)){

            }
            count++;
            bw.write(String.valueOf(count));

            count=0;
            j=1;
            fact=0;
            br.close();
            bw.close();
        }
    }
}
