/*
* https://tlx.toki.id/problems/troc-12/A
*/

import java.util.*;

public class PembatasanDunia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int X = sc.nextInt();

        System.out.println((X / A) + " " + (X % A));
    }
}
