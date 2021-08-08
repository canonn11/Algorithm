import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();

        switch(input.charAt(0)){
            case '0':
                sb.append(0);
                break;
            case '1':
                sb.append("1");
                break;
            case '2':
                sb.append("10");
                break;
            case'3':
                sb.append("11");
                break;
            case '4':
                sb.append("100");
                break;
            case '5':
                sb.append("101");
                break;
            case '6':
                sb.append("110");
                break;
            case '7':
                sb.append("111");
                break;
        }
        for(int i=1; i<input.length(); i++){
            switch(input.charAt(i)){
                case '0':
                    sb.append("000");
                    break;
                case '1':
                    sb.append("001");
                    break;
                case '2':
                    sb.append("010");
                    break;
                case'3':
                    sb.append("011");
                    break;
                case '4':
                    sb.append("100");
                    break;
                case '5':
                    sb.append("101");
                    break;
                case '6':
                    sb.append("110");
                    break;
                case '7':
                    sb.append("111");
                    break;
            }
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }

}