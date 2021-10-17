//package diffi8_10;

import java.util.HashMap;
import java.util.Scanner;

public class bOrg {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);


        System.out.println((sc.nextLine().chars().distinct().count() & 1)==0? "CHAT WITH HER!" : "IGNORE HIM!");
    }
}
