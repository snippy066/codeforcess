//package diffi8_10;

import java.util.Arrays;
import java.util.Scanner;

public class subPermutation {
    static StringBuilder sb=new StringBuilder();
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);

        int t=in.nextInt();

        while(t-->0){
            int n=in.nextInt();
            in.nextLine();
            String s=in.nextLine();
            int count=0;

            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String s2=String.valueOf(arr);

            for(int i=0;i<n;i++){
                int com=Character.compare(s.charAt(i),s2.charAt(i));
                if(com!=0) count++;
            }
            sb.append(count+"\n");
        }
        System.out.println(sb.toString());
    }
}
