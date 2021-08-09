import java.io.*;


public class Main {
    static Integer[] i;
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        i = new Integer[n+1];
        i[0]=0;
        i[1]=0;
        bw.write(String.valueOf(make1(n)));

        bw.close();
        br.close();
    }
    public static int make1(int n){
        if(i[n] ==null){
            if(n%6 == 0){
                i[n] = Math.min(make1(n/3),Math.min(make1(n/2),make1(n-1))) +1;
            }
            else if(n%3 ==0){
                i[n] = Math.min(make1(n/3),make1(n-1) )+1;
            }
            else if(n%2==0){
                i[n] = Math.min(make1(n/2),make1(n-1))+1;
            }
            else{
                i[n] = make1(n-1)+1;
            }
        }

        return i[n];
    }
}