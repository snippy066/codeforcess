//package diffi8_10;

import java.util.Scanner;

public class prob236A {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<25;i++){
            int num=sc.nextInt();
            if(num>0){
                System.out.println(Math.abs(i/5-2)+Math.abs(i%5-2));
                break;
            }
        }
    }
}
