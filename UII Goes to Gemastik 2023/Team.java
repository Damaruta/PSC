/*
* https://codeforces.com/contest/231/problem/A
*/

import java.util.*;
 
public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int soal = sc.nextInt();
        int yakin = 0;
 
        for (int i = 0; i < soal; i++) {
 
            int Petya = sc.nextInt();
            int Vasya = sc.nextInt();
            int Tonya = sc.nextInt();
 
            if (Petya + Vasya + Tonya > 1) {
                yakin++;
            }
        }
 
        System.out.println(yakin);
    }
}
