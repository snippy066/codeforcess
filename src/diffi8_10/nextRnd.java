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
        System.out.println(n-inde);
    }
    static int getpo(int[] arr,int l,int r,int key){
        while(l!=r){
            int mid=(l+r)/2;

            if(arr[mid]<=key)
                l=mid+1;
            else
                r=mid;
        }
        return l;
    }
}
