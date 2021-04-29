import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RedBlueBeans {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String line = br.readLine();
            String[] temp = line.trim().split("\\s+");
            int r = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);
            int d = Integer.parseInt(temp[2]);
            if (d == 0) {
                if (r == b)
                    System.out.println("YES");
                else
                    System.out.println("NO");
                continue;
            } else if (r == 1 || b == 1) {
                if (Math.abs(r - b) <= d)
                    System.out.println("YES");
                else
                    System.out.println("NO");
                continue;
            }
            int min = Math.min(r, b);
            int max = Math.max(r, b);
            int toTake = d + 1;
            int cycles = max / toTake;
            int rem = max % toTake;
            if (min < cycles) {
                System.out.println("NO");
            } else if (min == cycles) {
                if (rem == 0) System.out.println("YES");
                else System.out.println("NO");
            } else {
                min = min - cycles;
                max = rem;
                if (d + min - max >= 0) System.out.println("YES");
                else System.out.println("NO");
            }
        }
        br.close();
    }
}

