import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Double> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        double arr[] = new double[n];
        String input = br.readLine();
        char operator;
        double temp1=0;
        double temp2=0;

        for(int i=0; i<n; i++){
            arr[i] = Double.parseDouble(br.readLine());
        }
        for(int j=0; j<input.length(); j++){
            if((int)input.charAt(j)<=47 && (int)input.charAt(j)>=42){
                switch((int)input.charAt(j)){
                    case 42:
                        temp2 = stack.pop();
                        temp1 = stack.pop();
                        stack.push(temp1 * temp2);
                        break;
                    case 43:
                        temp2 = stack.pop();
                        temp1 = stack.pop();
                        stack.push(temp1 + temp2);
                        break;
                    case 45:
                        temp2 = stack.pop();
                        temp1 = stack.pop();
                        stack.push(temp1 - temp2);
                        break;
                    case 47:
                        temp2 = stack.pop();
                        temp1 = stack.pop();
                        stack.push(temp1 / temp2);
                        break;
                }

            }
            else{
                stack.push(arr[input.charAt(j)-65]);
            }
        }

        System.out.println(String.format("%.2f",stack.pop()));
        br.close();
    }
}
