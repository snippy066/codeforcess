//package diffi8_10;

import java.util.Scanner;

public class pizzaSilces {
    static StringBuilder sb=new StringBuilder();
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);

        int t=in.nextInt();

        while(t-->0){
            int n=in.nextInt();

            long num=0;
            if(n>8)
                num=(long)Math.ceil((n-8)/2);

            else
                num=(long)Math.ceil((n-8)/2);

            long tim=15+num*5;
            sb.append(tim+"\n");
        }
        System.out.println(sb.toString());
    }
}
