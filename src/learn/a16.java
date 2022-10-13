package learn;

import java.util.Scanner;

public class a16 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number=scan.nextInt();
        if(number%2==1){
            System.out.println("这个数字是：奇数");
        }else {
            System.out.println("这个数是：偶数");
        }

    }
}
