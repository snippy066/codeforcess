//package diffi8_10;

import java.util.Scanner;

public class pizzaSilces {
    static StringBuilder sb=new StringBuilder();
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);

        int t=in.nextInt();

        while(t-->0){
            long n=in.nextLong();

            while(n<6 || n%2!=0)    n++;
            sb.append(n/2*5+"\n");
        }
        System.out.println(sb.toString());
    }
}
