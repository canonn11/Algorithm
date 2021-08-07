import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();
        int l1,l2,l3;
        for(int i=input.length()-1; i>1;i-=3){
            l1 = (int) (input.charAt(i) -48);
            l2 = (int) ((input.charAt(i - 1) -48)*2);
            l3 = (int) ((input.charAt(i - 2) -48)*4);

            sb.append((l1+l2+l3));
        }
        if(input.length()%3 ==1){
            sb.append((int)input.charAt(0)-48);
        }
        else if(input.length() %3 ==2){
            sb.append((int)(input.charAt(1)-48)+(int)(((input.charAt(0)-48)*2)));
        }
        sb.reverse();


        bw.write(sb.toString());

        bw.close();
        br.close();
    }

}