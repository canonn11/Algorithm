import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            int number = Integer.parseInt(br.readLine());
            if(number == 0){
                break;
            }
            int a = 3;
            int b = number-3;
            int isG=0;
            while(true){
                if(a>b){
                    isG = -1;
                    break;
                }
                else if(isprimenumber(a) ==1&& isprimenumber(b)==1){
                    break;
                }
                else{
                    a = a+2;
                    b = b-2;
                }
            }
            if(isG == -1){
                bw.write("Goldbach's conjecture is wrong."+"\n");
            }
            else{
                bw.write(String.valueOf(number)+" = "+String.valueOf(a)+" + "+String.valueOf(b)+"\n");
            }
        }


        bw.close();
        br.close();
    }

    private static int isprimenumber(int n){
        if(n==1){
            return 0;
        }
        else{
            for(int i=2; i*i<=n; i++){
                if(n%i ==0){
                    return 0;
                }
            }
            return 1;
        }
    }
}