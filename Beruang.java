// https://tlx.toki.id/problems/troc-21/B
import java.util.*;

public class Beruang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membaca input n dan d
        int n = sc.nextInt();
        int d = sc.nextInt();

        // Membaca input bilangan dan menyimpannya dalam array a
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Mengurutkan array a
        Arrays.sort(a);

        // Menghitung jumlah pasangan bilangan yang selisihnya sama dengan d
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int j = Arrays.binarySearch(a, a[i] + d);
            if (j >= 0 && j != i) {
                ans++;
            }
        }

        // Menampilkan hasil
        System.out.println(ans);
    }
}
