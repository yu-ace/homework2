package learn;

import java.util.Scanner;

public class a22 {
    public static void main(String[] args) {
        float money=1170;
        String rebate="";
        if(money>200){
            int grade=(int) money/200;
            switch(grade){
                case 1:
                    rebate="九五折";
                    break;
                case 2:
                    rebate="九折";
                    break;
                case 3:
                    rebate="八五折";
                    break;
                case 4:
                    rebate="八三折";
                    break;
                case 5:
                    rebate="八折";
                    break;
                case 6:
                    rebate="七五折";
                    break;
                default:
                    rebate="七折";
                    break;
            }
        }
        System.out.println("累计消费金额为："+money);
        System.out.println("将享受"+rebate+"优惠！");
    }

}
