package diffi8_10;

import java.util.Scanner;

public class subPermutation {
    
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);

        int t=in.nextInt();

        while(t-->0){
            int n=in.nextInt();
            in.nextLine();
            String s=in.nextLine();
            int count=0;
            for(int i=0;i<n-1;i++){
                char firstvl=s.charAt(i);
                char secon=s.charAt(i+1);

                int comp=Character.compare(firstvl,secon);
                if(comp>0)  count++;
            }
            sb.append(count+"\n");
        }
    }
}
