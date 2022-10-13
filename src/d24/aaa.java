package d24;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 学生成绩管理系统 <br>
 *
 * 1. 老师录入学生成绩 <br>
 * 2. 展示学生成绩列表 <br>
 * 3. 计算平均分、最高分、最低分 <br>
 * 4. 统计各分数段人数 <br>
 * 5. 保存数据到磁盘 <br>
 * 6. 从磁盘中载入保存的数据 <br>
 * 7. 输入姓名，查找该学生的成绩 <br>
 * 8. 输入分数，查找所有大于等于该分数的学生姓名
 */
public  class aaa {
    static String students[] = new String[50];
    static int scores[] = new int[50];
    static int size = 0;

    static Scanner scan =new Scanner(System.in);


    public static void main(String[] args) {
        load();
        System.out.println("欢迎来到学生成绩管理系统：");
        printHelp();
        while(true){
            System.out.println("请输入指令，输入h显示帮助信息：");
            String a = scan.nextLine();
            if(a.equals("1")){
                // 录入学生成绩
                System.out.println("请输入学生姓名:");
                String name = scan.nextLine();
                System.out.println("请输入学生成绩:");
                int score = scan.nextInt();
                addStudent(name, score);
            }else if(a.equals("2")){
                // 输出学生成绩单
                printStudentList();
            }else if(a.equals("3")){
                // 计算学生的平均分，最高分和最低分
                System.out.println(average()+"\t"+max()+"\t"+min());
            }else if(a.equals("4")){
                // 统计每个分段的学生数量
                int[] groupByGrade = groupByGrade();
                System.out.println(groupByGrade[0]+"\t"+groupByGrade[1]+"\t"+groupByGrade[2]+"\t"+groupByGrade[3]+"\t"+groupByGrade[4]);
            }else if (a.equals("5")) {
                // 按学生姓名查询分数
                System.out.println("输入学生姓名：");
                System.out.println(queryByStudentName(scan.nextLine()));
            }else if(a.equals("6")){
                // 输出高于输入数字的分数
                System.out.println("输入成绩：");
                printStudentGradeGather(scan.nextInt());
            }else if(a.equals("h")){
                // 帮助
                printHelp();
            }else if(a.equals("q")){
                // 退出
                break;
            } else if (a.equals("s")) {
                save();
            }
        }
    }

    public static void save(){
        File studentDataFile = new File("D:/zz/student.txt");
        File studentScoreFile = new File("D:/zz/studentScore.txt");
        FileUtils.deleteQuietly(studentDataFile);
        FileUtils.deleteQuietly(studentScoreFile);
        try{
            for(int i = 0;i < size;i++){
                FileUtils.write(studentDataFile,students[i]+"\n","utf8",true);
                FileUtils.write(studentScoreFile,scores[i]+"\n","utf8",true);
            }
//            FileUtils.writeLines(studentDataFile, Arrays.asList(students));
        }catch(IOException e){
           e.printStackTrace();
        }
    }


    public static void load(){
        File studentDataFile = new File("D:/zz/student.txt");
        File studentScoreFile = new File("D:/zz/studentScore.txt");

        try{
            String a = FileUtils.readFileToString(studentDataFile,"utf8");
            String b = FileUtils.readFileToString(studentScoreFile,"utf8");
            String[] strs = a.split("\n");
            String[] stt = b.split("\n");
            if(strs.length != stt.length){
                System.out.println("数据文件被篡改");
            }
            for(int i =0;i < strs.length;i++){
                String name = strs[i];
                int grade = Integer.parseInt(stt[i]);
                addStudent(name,grade);
            }
           /* for(int i =0;i < strs.length;i++){
                System.out.println(strs[i]);
                students[i] = strs[i];
            }
            for(int i = 0;i <stt.length;i++){
                System.out.println(stt[i]);
                int sw = Integer.parseInt(stt[i]);
                scores[i] = sw;
                size++;
            }*/
        }catch(IOException e){
            e.printStackTrace();
        }

    }

    private static void addStudent(String name, int score) {
        students[size] = name;
        scores[size] = score;
        size++;
    }

    private static void printStudentGradeGather(int score) {
        for(int i = 0; i < size; i++){
            if(scores[i] >= score){
                System.out.println(students[i]);
            }
        }
    }

    private static void printStudentList() {
        for(int i = 0; i < size; i++){
            System.out.println(students[i]+"\t"+ scores[i]);
        }
    }

    public static void printHelp(){
        System.out.println("输入1录入学生成绩："+"\n"+"输入2展示学生成绩："+"\n"+"输入3显示平均分、最高分、最低分："
                +"\n"+"输入4显示各分段人数："+"\n"+"输入5查找学生成绩："+"\n"+"输入6查找某分数以上的学生姓名："+"\n"+"输入q退出系统：");
    }

    /**
     * 返回平均分
     * @return 学生的平均分
     */
    public static int average(){
        if(size==0)
            return -1;
        int sum = 0;
        for(int i = 0;i < size;i++){
            sum = sum + scores[i];
        }
        return sum/size;
    }


    /**
     * 返回分数最高的学生的分数
     * @return 最高分
     */
    public static int max(){
        int max = scores[0];
        for(int i = 0;i < size;i++){
            if(max < scores[i]){
                max = scores[i];
            }
        }
        return max;
    }

    /**
     * 返回分数最低的学生的分数
     * @return 最低分
     */
    public static int min(){
        int min = scores[0];
        for(int i = 0;i < size;i++){
            if(min > scores[i]){
                min = scores[i];
            }
        }
        return min;
    }


    /**
     * 返回各成绩段人数
     * @return 各成绩段人数<br>
     * result[0]:不及格 <br>
     * result[1]:60~70 <br>
     * result[2]:70~80 <br>
     * result[3]:80~90 <br>
     * result[4]:90~100 <br>
     */
    public static int[] groupByGrade(){
        int[] result = new int[5];
        for(int i = 0;i < size;i++){
            int b = scores[i];
            int grade = b / 10;
            switch (grade){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    result[0]++;
                    break;
                case 6:
                    result[1]++;
                    break;
                case 7:
                    result[2]++;
                    break;
                case 8:
                    result[3]++;
                    break;
                default:
                    result[4]++;
                    break;
            }
        }
        return result;
    }


    /**
     * 返回学生的分数
     * @param studentName 学生姓名
     * @return 该学生的分数
     */
    public static int queryByStudentName(String studentName){
        int z = 0;
        for(int i = 0;i < size;i++){
            if(students[i].equals(studentName)){
                z = scores[i];
            }
        }
        return z;
    }


}
