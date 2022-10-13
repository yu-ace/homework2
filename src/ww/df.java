package ww;

//* 学生成绩管理系统 *
// * 1.老师录入学生成绩
// * 2.展示学生成绩列表
// * 3.计算平均分、最高分、最低分
// * 4.统计各分数段人数
// * 5.保存数据到磁盘
// * 6.从磁盘中载入保存的数据
// *
// *//

import java.util.Scanner;

public class df {
    public static void main(String[] args) {
        String students[] = new String[50];
        int scores[] = new int[50];

        int size = 0;
        while (true) {
            System.out.println("欢迎来到学生成绩管理系统：");
            System.out.println("输入1录入学生成绩：");
            System.out.println("输入2生成学生成绩列表：");
            System.out.println("输入3计算平均分、最高分和最低分：");
            System.out.println("输入4计算各分段人数：");
            System.out.println("输入q退出；");
            System.out.println("请输入你的需求");
            Scanner scan = new Scanner(System.in);
            String a = scan.nextLine();
            if (a.equals("1")) {
                System.out.println("请输入学生姓名：");
                String name = scan.nextLine();
                System.out.println("请输入学生成绩：");
                int score = scan.nextInt();
                students[size] = name;
                scores[size] = score;
                size++;
            } else if (a.equals("2")) {
                for (int i = 0; i < size; i++) {
                    System.out.println(students[i] + "\t" + scores[i]);
                }
            } else if (a.equals("3")) {
                double sum = 0;
                double p = 0;
                int max = scores[0];
                int min = scores[0];
                for (int i = 0; i < size; i++) {
                    sum = sum + scores[i];
                    p = sum / size;
                    if (max < scores[i]) {
                        max = scores[i];
                    }
                    if (min > scores[i]) {
                        min = scores[i];
                    }
                }
                System.out.println(p + "\t" + max + "\t" + min);
            }else if(a.equals("4")){
                int bjg = 0;int jg = 0;int zd = 0;int lh =0;int yx =0;
                for(int i = 0;i < size;i++){
                    int fz = scores[i];
                    if(fz > 10){
                        int dj = fz / 10;
                        switch (dj){
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                bjg++;
                                break;
                            case 6:
                                jg++;
                                break;
                            case 7:
                                zd++;
                                break;
                            case 8:
                                lh++;
                                break;
                            default:
                                yx++;
                        }
                    }else{
                        bjg++;
                    }
                }
                System.out.println(bjg+"\t"+jg+"\t"+zd+"\t"+lh+"\t"+yx);
            }else if(a.equals("q")){
                break;
            }

        }
    }


}

