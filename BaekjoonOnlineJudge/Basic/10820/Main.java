import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        int big=0;
        int small=0;
        int num = 0;
        int space = 0;
        while((input = br.readLine())!=null){
            for(int i=0; i<input.length(); i++){
                if(Character.compare(input.charAt(i),' ')==0){
                    space++;
                }
                else if((int)input.charAt(i)>=65 && (int)input.charAt(i) <=90){
                    big++;
                }
                else if((int)input.charAt(i)>=97 && (int)input.charAt(i) <=122){
                    small++;
                }
                else{
                    num++;
                }
            }
            bw.write(String.valueOf(small)+" "+String.valueOf(big)+" "+String.valueOf(num)+" "+String.valueOf(space)+"\n");
            space=0;
            big=0;
            small=0;
            num=0;
        }
        bw.close();
        br.close();
    }
}