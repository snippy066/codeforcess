//package diffi8_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class prob339A {
    private static StringBuilder sb=new StringBuilder();
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);

        List<Integer> li=new ArrayList<>();
        String s=sc.nextLine();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='+') li.add(s.charAt(i)-48);
        }
        Collections.sort(li);
        sb.append(li.get(0));
        for(int i=1;i<li.size();i++){
            sb.append("+"+li.get(i));
        }

        System.out.println(sb.toString());
    }
}
