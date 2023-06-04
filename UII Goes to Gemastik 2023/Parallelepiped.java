/*
 * https://codeforces.com/contest/224/problem/A
 */

import java.util.*;

public class Parallelepiped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();

        double r1 = Math.sqrt((s1 * s2) / s3);
        double r2 = Math.sqrt((s1 * s3) / s2);
        double r3 = Math.sqrt((s2 * s3) / s1);

        System.out.println((int) (r1 + r2 + r3) * 4);
    }
}
