//package diffi8_10;

import java.util.Scanner;

public class alphaString {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            sc.nextLine();
            while (t-- != 0) {
                String s = sc.nextLine();
                int len = s.length(), l = 0, r = len - 1, flag = 0;
                while (l <= r) {
                    if (s.charAt(l) == ((char) ('a' + len - 1))) l++;
                    else if (s.charAt(r) == ((char) ('a' + len - 1))) r--;
                    else {
                        flag = 1;
                        break;
                    }
                    len--;
                }
                if (flag == 0) System.out.println("YES");
                else System.out.println("NO");
            }
        }

}
