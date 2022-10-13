package learn;

import java.util.Scanner;

public class a23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入月份，告诉你什么季节。");
        int month = scan.nextInt();
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("输入的月份是冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("输入的月份是春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("输入的月份是夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("输入的月份是秋季");
                break;
            default:
                System.out.println("输入无效" + month + "重输");
        }
    }
}
