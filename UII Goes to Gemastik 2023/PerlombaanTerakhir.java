/*
 * https://tlx.toki.id/problems/troc-9/A
 */

import java.util.*;

public class PerlombaanTerakhir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        int jmlO = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'O') {
                jmlO++;
            }
        }

        System.out.println(jmlO == 0 || jmlO > 1 ? "Tidak" : "Ya");
    }
}
