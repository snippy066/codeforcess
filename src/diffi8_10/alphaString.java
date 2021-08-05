//package diffi8_10;

import java.util.Scanner;

public class alphaString {
    static StringBuilder sb=new StringBuilder();
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);

        int t=in.nextInt();
        in.nextLine();
        while(t-->0){
            String s=in.nextLine();
            int len=s.length();

            int[] alph=new int[26];

            for(int i=0;i<len;i++){
                alph[s.charAt(i)-'a']++;
            }
            int flag=0;
            for(int i=0;i<len;i++){
                if(alph[i]==0){
                    flag=1;
                    break;
                }
            }

            if(flag==1)
                sb.append("NO");
            else
                sb.append("YES");
        }
        System.out.println(sb.toString());
    }
}
