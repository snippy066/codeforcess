import java.util.*;
//import java.io.*;


public class stringReplace{
    public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            int len=s.length();
            String[] arr=s.split("");
            System.out.println(arr[0]+(len-2)+arr[len-1]);
        }
	}
}