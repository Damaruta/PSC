/*
 * https://tlx.toki.id/problems/troc-7/A
 */

import java.util.*;

public class PrestasiMerahPutih {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A[] = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int X = sc.nextInt();

        for (int i = 0; i < A.length; i++) {
            if (A[i] == X) {
                System.out.println(i + 1);
            }
        }
    }
}
