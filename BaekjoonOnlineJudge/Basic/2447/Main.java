import java.io.*;

public class Main {
    static char arr[][];
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        arr = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = ' ';
            }
        }
        star(0,0,n);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                bw.write(arr[i][j]);
            }
            bw.write("\n");
        }
        bw.close();
        br.close();
    }

    private static void star(int x, int y, int n){
        if(n==1){
            arr[x][y] = '*';
            return;
        }
        int temp = n/3;

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i==1 && j==1){

                }
                else{
                    star(x+(temp*i),y+(temp*j),temp);
                }
            }
        }
    }
}
