import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringBuffer stb;
        int cursor = 0;
        int cursor2 = 0;
        int eof=0;
        String temp = "";

        String input = br.readLine();
        char arr[] = new char[input.length()];
        for(int i=0; i<input.length(); i++){
            arr[i] = input.charAt(i);
        }

        while(cursor < input.length()){
            if(Character.compare(arr[cursor],'<')==0){
                if(cursor2 !=cursor){
                    for(int i = cursor2; i<cursor; i++){
                        temp = temp + arr[i];
                    }
                    stb = new StringBuffer(temp);
                    temp = stb.reverse().toString();
                    sb.append(temp);
                    temp = "";
                    cursor2 = cursor;
                }
                for(int j=cursor; j<input.length(); j++){
                    if(Character.compare(arr[j],'>')==0){
                        cursor = j;
                        for(int k=cursor2; k<=cursor; k++){
                            sb.append(arr[k]);
                        }
                        temp = "";
                        cursor2 = cursor+1;
                        break;
                    }
                }
            }
            else if(Character.compare(arr[cursor],' ')==0 || cursor == input.length()-1){
                if(cursor == input.length()-1){
                    cursor = cursor+1;
                    eof=-1;
                }
                for(int l=cursor2; l<cursor; l++){
                    temp = temp + arr[l];
                }
                stb = new StringBuffer(temp);
                temp = stb.reverse().toString();
                if(eof == -1){
                    sb.append(temp);
                }
                else{
                    sb.append(temp+" ");
                }
                temp = "";
                eof=0;
                cursor2 = cursor+1;
            }
            cursor++;
        }
        bw.write(String.valueOf(sb));
        br.close();
        bw.close();
    }
}
