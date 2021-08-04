//package diffi8_10;

import java.util.Scanner;

public class digitSum {
    static StringBuilder sb=new Scanner(System.in);
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);

        int t=in.nextInt();

        while(t-->0){
            long n=in.nextLong();

            sb.append(n/9+"\n");
        }

        System.out.println(sb.toString());
    }
}
