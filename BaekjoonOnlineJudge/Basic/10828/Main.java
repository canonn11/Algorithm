import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    static LinkedList<Integer> list = new LinkedList<Integer>();

    public static void push(int x){
        list.addLast(x);
    }
    public static void pop(){
        list.removeLast();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String cmd;
        int num;

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            cmd = st.nextToken();
            if(cmd.equals("push")) {
                num = Integer.parseInt(st.nextToken());
                push(num);
            }
            else if(cmd.equals("pop")){
                if(list.isEmpty()){
                    bw.write("-1"+"\n");
                }
                else {
                    bw.write(list.get(list.size()-1)+"\n");
                    pop();
                }
            }
            else if(cmd.equals("size")){
                bw.write(list.size()+"\n");
            }
            else if (cmd.equals("empty")){
                if(list.isEmpty()){
                    bw.write("1"+"\n");
                }
                else{
                    bw.write("0"+"\n");
                }
            }
            else if (cmd.equals("top")){
                if(list.isEmpty()){
                    bw.write("-1"+"\n");
                }
                else{
                    bw.write(list.get(list.size()-1)+"\n");
                }
            }



        }
        br.close();
        bw.close();
    }
}
