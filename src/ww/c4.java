package ww;

import java.util.regex.Pattern;

public class c4 {
    public static void main(String[] args) {
        String a = "askDSA @# 156";
        int b = 0;int c = 0;int d = 0;
        for(int i = 0;i <a.length();i++){
            Boolean zm = Pattern.matches ("^[\\p{Lower}||\\p{Upper}]",a.charAt(i)+"");
            if(zm == true){
                b++;
            }
            Boolean kg = Pattern.matches ("^[\\p{Blank}]",a.charAt(i)+"");
            if(kg == true){
                c++;
            }
            Boolean sz = Pattern.matches ("^[\\d]",a.charAt(i)+"");
            if(sz == true){
                d++;
            }
        }
        System.out.println(b+"\t"+c+"\t"+d+"\t"+(a.length()-b-c-d));
    }
}
