/*
* https://tlx.toki.id/problems/troc-1/A
*/

import java.util.*;

public class AbsoluteWinner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.println(
                4 * (A + B + C) / 7 == A || 4 * (A + B + C) / 7 == B || 4 * (A + B + C) / 7 == C ? "YA" : "TIDAK");
    }
}
