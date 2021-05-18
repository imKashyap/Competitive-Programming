import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PotionMaking {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            int k = Integer.parseInt(br.readLine());
            if(k==100){
                System.out.println("1");
                continue;
            }
            int w= 100-k;
            int gcd=gcd(w,k);
            int a1=w/gcd;
            int a2= k/gcd;
            System.out.println(a1+a2);
        }
        br.close();
    }

    private static int gcd(int a, int b){
        if (a == 0)
            return b;
        return gcd(b%a, a);
    }
}
