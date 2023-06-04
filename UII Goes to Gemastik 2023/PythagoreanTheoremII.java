/*
 * https://codeforces.com/problemset/problem/304/A
 */

import java.util.*;

public class PythagoreanTheoremII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int total = 0;

        double c;

        for (int a = 1; a < n; a++) {
            for (int b = a + 1; a * a + b * b <= n * n; b++) {

                c = a * a + b * b;

                int akarCkuadrat = (int) Math.sqrt(c) * (int) Math.sqrt(c);

                if (akarCkuadrat == c)
                    total++;
            }
        }

        System.out.println(total);
    }
}
