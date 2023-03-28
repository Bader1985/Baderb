import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; ++i) {
            for (int m = 1; m <= n - i; ++m) {
                System.out.print(" ");
            }
            for (int j = 1; j <= k; ++j) {
                System.out.print(" * ");
            }
            System.out.println();
        }


    }
}
