/*
* https://codeforces.com/contest/263/problem/A
*/

import java.util.*;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int BM[][] = new int[5][5];
        int barisTarget = 0;
        int kolomTarget = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int k = sc.nextInt();
                BM[i][j] = k;
                if (k == 1) {
                    barisTarget = i;
                    kolomTarget = j;
                }
            }
        }

        System.out.println(Math.abs(2 - barisTarget) + Math.abs(2 - kolomTarget));
    }
}
