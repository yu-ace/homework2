package learn;

import java.util.Scanner;

public class a20 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("输入用户名：");
        String username= scan.nextLine();
        System.out.println("密码");
        String password= scan.nextLine();
        if(!username.equals("mr")){
            System.out.println("用户名错误");
        }else if (!password.equals("mrsoft")){
            System.out.println("密码错误");
        }else{
            System.out.println("登陆成功");
        }
    }
}
