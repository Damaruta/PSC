/*
* https://codeforces.com/contest/255/problem/A
*/

import java.util.*;
 
public class GregsWorkout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int jmlLat = sc.nextInt();
        int latChest = 0;
        int latBiceps = 1;
 
        int chest = 0;
        int biceps = 0;
        int back = 0;
 
        for (int i = 0; i < jmlLat; i++) {
            if (i == latChest) {
                chest = chest + sc.nextInt();
                latChest = latChest + 3;
            } else if (i == latBiceps) {
                biceps = biceps + sc.nextInt();
                latBiceps = latBiceps + 3;
            } else {
                back = back + sc.nextInt();
            }
        }
 
        if (chest > biceps && chest > back) {
            System.out.println("chest");
        } else {
            System.out.println(biceps > back ? "biceps" : "back");
        }
 
    }
}
