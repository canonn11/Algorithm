import java.io.IOException;
import java.io.*;
import java.util.LinkedList;


public class Main {

    static LinkedList list = new LinkedList();
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        int length;
        char temp;
        int yes=0;


        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            line = br.readLine();
            length = line.length();
            for(int j=0; j<length; j++){
                temp = line.charAt(j);
                if(Character.compare(temp,'(')==0){
                    list.addLast('(');
                }
                else if(list.isEmpty()){
                    yes=1;
                }
                else{
                    list.removeLast();
                }
            }
            if(list.isEmpty()&& yes==0){
                bw.write("YES"+"\n");
            }
            else{
                bw.write("NO"+"\n");
            }
            list.clear();
            yes=0;
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
