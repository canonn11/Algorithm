import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a;
        int b;
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int n1 = (n / 2) - 1;
            int n2 = (n / 2) + 1;
            if (n == 4 || n == 6) {
                n1 = n / 2;
                n2 = n / 2;
            }
            else {
                while (true) {
                    if ((n1 % 2) == 0 && (n2 % 2 == 0)) {
                        if ((n1 + 1) == (n2 - 1) && isprime(n1 + 1) == 1) {
                            n1 = n / 2;
                            n2 = n / 2;
                            break;
                        } else {
                            n1 -= 1;
                            n2 += 1;
                        }
                    } else if (isprime(n1) == 1 && isprime(n2) == 1) {
                        a = n1;
                        b = n2;
                        break;
                    } else {
                        n1 -= 2;
                        n2 += 2;
                    }
                }
            }
            bw.write(String.valueOf(n1) + " " + String.valueOf(n2) + "\n");
        }
        bw.close();
        br.close();
    }
        private static int isprime ( int n){
            if (n == 1) {
                return 0;
            }
            else {
                for (int i = 2; i * i <= n; i++) {
                    if (n % i == 0) {
                        return 0;
                    }
                }
                return 1;
            }
        }
    }
