package work;

public class n5 {
    public static void main(String[] args) {
        double high=100;
        double sum=100;
        for(int n=0;n<10;n++){
            high=high/2;
           sum=sum+2*high;
        }
        System.out.println("第十次落地时，共经过的了"+sum+"米");
        System.out.println("第10次反弹"+high+"米");
    }
}
