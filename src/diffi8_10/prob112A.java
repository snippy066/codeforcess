//package diffi8_10;

import java.util.Scanner;

public class prob112A {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);

         String s1=sc.nextLine().toLowerCase();
         String s2=sc.nextLine().toLowerCase();

         int ans=s1.compareTo(s2);

         if(ans<0) System.out.println("-1");
         else if(ans>0) System.out.println("1");
         else System.out.println(ans);

    }
}
