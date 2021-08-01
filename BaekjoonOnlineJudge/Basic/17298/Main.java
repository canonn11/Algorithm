import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<Integer>();
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]){
                arr[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty()) {
            arr[stack.pop()] = -1;
        }

        for(int j=0; j<n; j++){
            bw.write(String.valueOf(arr[j]) + " ");
        }

        br.close();
        bw.close();
    }
}
