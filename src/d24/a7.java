package d24;

public class a7 {
    public static void main(String[] args) {
        int money = 67;
        double lr = 0;
        if(money > 10){
            int grade = money / 10;
            switch (grade){
                case 1:
                    lr = 1 + 0.075 * (money - 10);
                    break;
                case 2:
                case 3:
                    lr = 1 * 0.075 * 10 + 0.05 * (money - 20);
                    break;
                case 4:
                case 5:
                    lr = 1 * 0.075 * 10 + 0.05 * 20 + 0.03 * (money - 40);
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                    lr = 1 * 0.075 * 10 + 0.05 * 20 + 0.03 * 20 + 0.015 * (money - 60);
                    break;
                default:
                    lr = 1 * 0.075 * 10 + 0.05 * 20 + 0.03 * 20 + 0.015 * 40 + 0.01 * (money - 100);
                    break;
            }
        }else {
            lr = 0.1 * money;
        }
        System.out.println(lr);
    }
}
