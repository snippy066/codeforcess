//package diffi8_10;

import java.util.Arrays;
import java.util.Scanner;

public class prob281A {
    public static  void main(String ar[]){
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        StringBuilder sb=new StringBuilder(s);

       String s1=String.valueOf(sb.charAt(0)).toUpperCase();

        sb.replace(0,1,s1);
        System.out.println(sb.toString());
    }
}
