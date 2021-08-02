import java.io.*;


public class Main {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i)>=65 && input.charAt(i)<=90){
                if(input.charAt(i)+13 > 90){
                    sb.append((char)(input.charAt(i)-13));
                }
                else{
                    sb.append((char)(input.charAt(i)+13));
                }
            }
            else if(input.charAt(i) >=97 && input.charAt(i)<=122){
                if(input.charAt(i)+13 > 122){
                    sb.append((char)(input.charAt(i)-13));
                }
                else{
                    sb.append((char)(input.charAt(i)+13));
                }
            }
            else{
                sb.append(input.charAt(i));
            }
        }
        bw.write(sb.toString());
        bw.close();
        br.close();

    }
}
