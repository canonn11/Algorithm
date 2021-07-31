import java.io.*;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        Deque<Integer> deque = new LinkedList<>();
        String cmd;
        int value;

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            cmd = st.nextToken();
            switch(cmd){
                case "push_front":
                    value = Integer.parseInt(st.nextToken());
                    deque.addFirst(value);
                    break;
                case "push_back":
                    value = Integer.parseInt(st.nextToken());
                    deque.addLast(value);
                    break;
                case "pop_front":
                    if(deque.isEmpty()){
                        bw.write("-1"+"\n");
                    }
                    else{
                        bw.write(String.valueOf(deque.getFirst())+"\n");
                        deque.removeFirst();
                    }
                    break;
                case "pop_back":
                    if(deque.isEmpty()){
                        bw.write("-1"+"\n");
                    }
                    else{
                        bw.write(String.valueOf(deque.getLast())+"\n");
                        deque.removeLast();
                    }
                    break;
                case "size":
                    bw.write(String.valueOf(deque.size())+"\n");
                    break;
                case "empty":
                    if(deque.isEmpty()){
                        bw.write("1"+"\n");
                    }
                    else{
                        bw.write("0"+"\n");
                    }
                    break;
                case "front":
                    if(deque.isEmpty()){
                        bw.write("-1"+"\n");
                    }
                    else{
                        bw.write(String.valueOf(deque.getFirst())+"\n");
                    }
                    break;
                case "back":
                    if(deque.isEmpty()){
                        bw.write("-1"+"\n");
                    }
                    else{
                        bw.write(String.valueOf(deque.getLast())+"\n");
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