/*
 * https://tlx.toki.id/problems/troc-1/B
 */

import java.util.*;

public class TitikMerah {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int R = sc.nextInt();
        int V = sc.nextInt();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int W = sc.nextInt();
            min = Math.min(min, Math.abs(W - V));
        }

        System.out.println(min == 0 ? -1 : String.format("%.9f", (double) R / min));
    }
}
