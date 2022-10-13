package learn;

import java.sql.SQLOutput;
import java.util.Scanner;

public class a18 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入变量A");
        int A=scan.nextInt();
        System.out.println("请输入变量B");
        int B=scan.nextInt();
        System.out.println("A="+A+"\t"+"B="+B);
        System.out.println("之形变量互换。。。");
        A=A^B;
        B=B^A;
        A=A^B;
        System.out.println("A="+A+"\t"+"B="+B);
    }
}
