package learn;

import java.util.Scanner;

public class a17 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        long number= scan.nextLong();
        System.out.println("你输入的数字是："+number);
        System.out.println("该数字乘以2位"+(number<<1));
        System.out.println("该数字乘以4位"+(number<<2));
        System.out.println("该数字乘以8位"+(number<<3));
        System.out.println("该数字乘以16位"+(number<<4));
    }
}
