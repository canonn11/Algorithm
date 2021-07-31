import java.io.*;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        Queue<Integer> queue = new LinkedList<>();
        String cmd;
        int value;
        int last=0;

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            cmd = st.nextToken();
            switch(cmd){
                case "push":
                    value = Integer.parseInt(st.nextToken());
                    queue.offer(value);
                    last = value;
                    break;
                case "pop":
                    if(queue.isEmpty()){
                        bw.write("-1"+"\n");
                    }
                    else{
                        bw.write(String.valueOf(queue.peek())+"\n");
                        queue.remove();
                    }
                    break;
                case "size":
                    bw.write(String.valueOf(queue.size())+"\n");
                    break;
                case "empty":
                    if(queue.isEmpty()){
                        bw.write("1"+"\n");
                    }
                    else{
                        bw.write("0"+"\n");
                    }
                    break;
                case "front":
                    if(queue.isEmpty()){
                        bw.write("-1"+"\n");
                    }
                    else{
                        bw.write(String.valueOf(queue.peek())+"\n");
                    }
                    break;
                case "back":
                    if(queue.isEmpty()){
                        bw.write("-1"+"\n");
                    }
                    else{
                        bw.write(String.valueOf(last)+"\n");
                    }
                    break;
                default:
                    break;
            }
        }
        br.close();
        bw.close();
    }
}