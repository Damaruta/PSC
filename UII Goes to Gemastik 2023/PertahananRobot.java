/*
* https://tlx.toki.id/problems/troc-11/A
*/

import java.util.*;

public class PertahananRobot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String gerakan = sc.nextLine();
        int x = 0;
        int y = 0;

        for (int i = 0; i < gerakan.length(); i++) {
            switch (gerakan.charAt(i)) {
                case 'R':
                    x = x + 1;
                    break;
                case 'L':
                    x = x - 1;
                    break;
                case 'U':
                    y = y + 1;
                    break;
                case 'D':
                    y = y - 1;
                    break;
            }
        }

        System.out.println(x + " " + y);
    }
}
