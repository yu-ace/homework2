package d24;

public class a3 {
    public static void main(String[] args) {
        int m = 96;int n =42;
        int max;int min;
        if(m > n){
            max = m;
            min = n;
        }else{
            max = n;
            min = m;
        }
        while(max % min !=0){
            int d = max % min;
            max = min;
            min = d;
        }
        System.out.println(min);
        System.out.println(m * n / min);
    }
}
