package diffi8_10;

import java.util.Arrays;
import java.util.Scanner;

public class nextRnd {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++)    arr[i]=sc.nextInt();

        Arrays.sort(arr);

        int inde=getpo(arr,0,n,k);
        System.out.println(inde);
    }
}
