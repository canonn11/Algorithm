import java.io.*;


public class Main {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int arr[] = new int[26];
        char temp;
        int num;

        for(int i=0; i<26; i++){
            arr[i] = -1;
        }

        for(int i=0; i<input.length(); i++){
            temp = input.charAt(i);
            num = (int)temp - 97;
            if(arr[num] == -1){
                arr[num] = i;
            }
        }

        for(int j=0; j<26; j++){
            bw.write(String.valueOf(arr[j])+" ");
        }

        bw.close();
        br.close();
    }
}