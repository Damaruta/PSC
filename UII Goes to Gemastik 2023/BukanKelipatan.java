import java.util.*;

public class BukanKelipatan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int X = 0;

        for (int i = 2; i <= 100; i++) {
            if (i % A != 0 && i % B != 0 && i % C != 0) {
                X = i;
                break;
            }
        }

        System.out.println(X);
    }
}
