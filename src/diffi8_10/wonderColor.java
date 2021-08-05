//package diffi8_10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class wonderColor {
    static StringBuilder sb=new StringBuilder();
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);

        int t=in.nextInt();
        in.nextLine();
        while(t-->0){
            String [] s=in.nextLine().split("");
            if(s.length<2) sb.append("0\n");

            else{
                HashMap<String,Integer> hs=new HashMap<>();

                for(int i=0;i<s.length;i++){
                    if(hs.containsKey(s[i]))    hs.put(s[i],2);
                    else hs.put(s[i],1);
                }
                long sum=0;
                for(String s1:hs.keySet()){
                    sum+=hs.get(s1);
                }
                sb.append(sum/2+"\n");
            }
        }
        System.out.println(sb.toString());
    }
}
