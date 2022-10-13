package d24;

public class a5 {
    public static void main(String[] args) {
        double high = 100;
        double sum = 100;
        for(int i = 0;i < 10;i++){
            high = high / 2;
            sum = sum + 2 * high;
        }
        System.out.println(sum);
        System.out.println(high);
    }
}
