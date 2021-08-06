import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int temp;

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        while(a!=0){
            if(a>b && a>c){
                temp = a;
                a = c;
                c = temp;
            }
            else if(b>a && b>c){
                temp = b;
                b = c;
                c = temp;
            }

            if((Math.pow(a,2) + Math.pow(b,2))==Math.pow(c,2)){
                bw.write("right"+"\n");
            }
            else{
                bw.write("wrong"+"\n");
            }

            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
        }

        bw.close();
        br.close();
    }

}