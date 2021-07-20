//package diffi8_10;

import java.util.Arrays;
import java.util.Scanner;

public class nextRnd {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        int[] arr=new int[n];
        int val=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]!=0 && arr[i]>=arr[k-1])   val++;
        }

        System.out.println(val);
    }
}
