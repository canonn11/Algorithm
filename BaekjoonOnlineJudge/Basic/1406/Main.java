import java.io.*;
import java.io.IOException;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException{
        LinkedList<Character> list = new LinkedList<Character>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String cmd;
        String letter;

        String N = br.readLine();
        ListIterator<Character> iter = list.listIterator();
        for(int i=0; i<N.length(); i++){
            iter.add(N.charAt(i));
        }
        while(iter.hasNext()){
            iter.next();
        }
        int M = Integer.parseInt(br.readLine());

        for(int j=0; j<M; j++){
            st = new StringTokenizer(br.readLine());
            cmd = st.nextToken();
            if(cmd.equals("L")){
                if(iter.hasPrevious()){
                    iter.previous();
                }
            }
            else if(cmd.equals("D")){
                if(iter.hasNext()){
                    iter.next();
                }
            }
            else if(cmd.equals("B")){
                if(iter.hasPrevious()){
                    iter.previous();
                    iter.remove();
                }
            }
            else if(cmd.equals("P")){
                letter = st.nextToken();
                iter.add(letter.charAt(0));
            }
        }

        for(char c : list){
            bw.write(c);
        }
        br.close();
        bw.close();
    }
}
