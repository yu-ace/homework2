package work;

import java.util.Scanner;

public class n7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入当月利润（整数万元）：");
        int money= scan.nextInt();
        double bonus;
        if(money>10){
            int grade=money/10;
            switch(grade){
                case 1:
                    bonus=1+0.075*(money-10);
                    break;
                case 2:
                case 3:
                    bonus=1+0.75+0.05*(money-20);
                    break;
                case 4:
                case 5:
                    bonus=1+0.75+1+0.03*(money-40);
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                    bonus=1+0.75+1+0.6+0.015*(money-60);
                    break;
                default:
                    bonus=1+0.75+1+0.6+0.6+0.001*(money-100);
            }
        }else{
            bonus=money*0.1;
        }
        System.out.println("发放奖金总数为："+ bonus+"万元" );
    }
}
