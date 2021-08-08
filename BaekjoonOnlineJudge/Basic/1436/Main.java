import java.io.*;


public class Main {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int j=666;
        int temp=0;
        int count=0;
        while(count!=n){
            if(String.valueOf(j).contains("666")){
                count++;
                temp = j;
            }
            j++;
        }
        bw.write(String.valueOf(temp));


        bw.close();
        br.close();
    }

}