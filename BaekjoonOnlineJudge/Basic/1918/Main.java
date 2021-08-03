import java.io.*;
import java.util.Stack;
public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<Character>();
        int count=0;
        String input = br.readLine();

        for(int i=0; i<input.length(); i++){
            if(Character.compare(input.charAt(i),'(')==0){
                stack.add(input.charAt(i));
            }
            else if(Character.compare(input.charAt(i),')')==0){
                while(stack.peek()!='('){
                    sb.append(stack.pop());
                }
                stack.pop();
            }
            else if(Character.compare(input.charAt(i),'+')==0 || Character.compare(input.charAt(i),'-')==0 ){
                while(!stack.isEmpty() && (stack.peek() == '+' || stack.peek() == '-' || stack.peek()=='*' || stack.peek() == '/')){
                    sb.append(stack.pop());
                }
                stack.add(input.charAt(i));
            }
            else if(Character.compare(input.charAt(i),'*')==0 || Character.compare(input.charAt(i),'/')==0){
                while(!stack.isEmpty() && (stack.peek() == '*' || stack.peek() == '/')){
                    sb.append(stack.pop());
                }
                stack.add(input.charAt(i));
            }
            else{
                sb.append(input.charAt(i));
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}
