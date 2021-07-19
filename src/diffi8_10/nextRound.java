//package diff8_10;

import java.util.Arrays;
import java.util.Scanner;

public class nextRound {
    public void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++)    arr[i]=sc.nextInt();

        Arrays.sort(arr);

        int inde=getpo(arr,0,n,k);
        System.out.println(inde);
    }

    static int getpo(int[] arr,int l,int r,int key){
        if(l<r){
            int mid=(l+r)/2;
            if(arr[mid]>=key)
                return l;

            return getpo(arr,mid+1,r,key);
        }

        return l;
    }
}
