import java.io.*;
import java.io.IOException;
import java.util.SortedMap;
import java.util.Stack;

public class Main {
    static Stack<Integer> st = new Stack<Integer>();

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int num;
        int start=0;

        for(int i=0; i<n; i++){
            num = Integer.parseInt(br.readLine());

            if(start < num){
                for(int j = start+1; j<=num; j++){
                    st.push(j);
                    sb.append("+"+"\n");
                }
                start = num;
            }
            else if(st.peek() != num){
                System.out.print("NO");
                return;
            }
            st.pop();
            sb.append("-"+"\n");
        }
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();

    }
}
