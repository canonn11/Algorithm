import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int arr[] = new int[26];
        for(int i=0; i<26; i++){
            arr[i] = 0;
        }
        for(int j=0; j<input.length(); j++){
            arr[input.charAt(j)-97]++;
        }

        for(int k=0; k<26; k++){
            bw.write(String.valueOf(arr[k])+" ");
        }
        bw.close();
        br.close();
    }
}
