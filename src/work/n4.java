package work;

import java.util.Scanner;
import java.util.regex.Pattern;

public class n4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("输入内容：");
        String a= scan.nextLine();
        int b = 0;int c = 0;int d = 0;int e = a.length();
        for(int i=0;i<a.length();i++){
            Boolean matches= Pattern.matches("\\p{Lower}||\\p{Upper}",a.charAt(i)+"");
            if(matches){
                b++;
            }
        }
        for(int i=0;i<a.length();i++){
            Boolean matches= Pattern.matches("\\s",a.charAt(i)+"");
            if(matches){
                c++;
            }
        }
        for(int i=0;i<a.length();i++){
            Boolean matches= Pattern.matches("\\d",a.charAt(i)+"");
            if(matches){
                d++;
            }
        }
        System.out.println("字母个数为："+b);
        System.out.println("空格个数为："+c);
        System.out.println("数字个数为："+d);
        System.out.println("其他字符个数为："+(e-b-c-d));



    }
}
