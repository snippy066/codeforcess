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
            int index=0,present_index=0;
            int flag=0;

            index=s.charAt(0)-'a';
            present_index=index;

            for(int i=0;i<len;i++){
                index=s.charAt(i)-'a';

                if(index-present_index>1 || present_index-index>1) {
                    flag = 1;
                    break;
                }
                alph[index]++;
                present_index=index;
            }

//            for(int i=0;i<len;i++){
//                if(alph[i]==0){
//                    flag=1;
//                    break;
//                }
//            }

            if(flag==1)
                sb.append("NO\n");
            else
                sb.append("YES\n");
        }
        System.out.println(sb.toString());
    }
}
