package d24;

import java.util.Scanner;

/**
 * 1.if判断语句；
 * 2.for循环的使用；
 * 3.数据类型使用和转换
 * 4.函数调用
 */
public class all {
    public static void main(String[] args) {
        System.out.println(e(1));
    }

    public static double e(int a){
        double sum = 0;
        for(int i = 0;i <= 10;i++){
            int b = pow(a,i);
            int c = fact(i);
            sum = sum + (b / (double)c);
        }
        return sum;
    }



    public static int pow (int a,int n){
        int z = 1;
        for(int i = 0;i < n;i++){
            z =  z * a;
        }
        return z;
    }

    public static int fact(int n){
        int z = 1;
       for(int i = 1;i <= n;i++){
            z = z * i;
        }
        return z;
    }


}


