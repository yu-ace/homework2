package work;

import java.util.Scanner;

public class n3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("输入第一个数字：");
        int a= scan.nextInt();
        System.out.println("输入第二个数字：");
        int b = scan.nextInt();
        int max;     int min;
        int d;
        if(a>b){
            max = a;
            min = b;
        }
        else{
            max = b;
            min = a;
        }
        int e = a * b;
        while(max % min != 0){
            d = max % min;
            max = min;
            min = d;
        }
        System.out.println("最大公因数为："+min);
        System.out.println("最小公倍数为："+e/min);


    }
}
