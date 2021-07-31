import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        LinkedList<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int cursor=0;
        int arr[] = new int[n];
        int count=0;

        for(int i=1; i<=n; i++){
            queue.add(i);
        }

        while(queue.size()>0){
            cursor = (cursor+(k-1)) %queue.size();
            arr[count] = queue.get(cursor);
            queue.remove(cursor);
            count++;
        }
        bw.write("<");
        for(int l=0; l<n-1;l++){
            bw.write(String.valueOf(arr[l]+", "));
        }
        bw.write(String.valueOf(arr[n-1])+">");
        bw.close();
        br.close();
    }
}
