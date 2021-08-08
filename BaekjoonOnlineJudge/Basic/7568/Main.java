import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int height[] = new int[n];
        int weight[] = new int[n];
        int size[] = new int[n];
        for(int i=0; i<n; i++){
            size[i] = -1;
        }
        StringTokenizer st;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            weight[i] = Integer.parseInt(st.nextToken());
            height[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < n; i++) {
            int rank = 1;

            for(int j = 0; j < n; j++) {
                if(i == j) continue;
                if (weight[i] < weight[j] && height[i] < height[j]) {
                    rank++;
                }
            }
            size[i] = rank;
        }
        for(int i=0; i<n; i++){
            bw.write(String.valueOf(size[i])+" ");
        }

        bw.close();
        br.close();
    }

}