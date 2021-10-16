//package diffi8_10;

import java.util.Scanner;

public class bit {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int x=0;
        sc.nextLine();
        while(n-->0){
            String s=sc.nextLine();
            if(s.contains("++")) x++;
            else if(s.contains("--")) x--;
        }
        System.out.println(x);
    }
}
