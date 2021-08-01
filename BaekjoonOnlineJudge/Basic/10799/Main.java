import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack st = new Stack();
        String input = br.readLine();
        int count=0;

        for(int i=0; i<input.length(); i++){
            if(Character.compare(input.charAt(i),'(')==0){
                st.add('(');
            }
            else if(Character.compare(input.charAt(i),')')==0){
                if(Character.compare(input.charAt(i-1),'(')==0){
                    st.pop();
                    count = count + st.size();
                }
                else{
                    st.pop();
                    count++;
                }
            }
        }

        bw.write(String.valueOf(count));
        br.close();
        bw.close();
    }
}
