//package diffi8_10;

import java.util.Scanner;

public class prob266A {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        sc.nextLine();
        String s[]=sc.nextLine().split("");

        int ans=0;

        for(int i=1;i<n;i++){
            if(s[i-1].equals(s[i])) ans++;
        }
        System.out.println(ans);
    }
}
