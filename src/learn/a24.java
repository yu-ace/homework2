package learn;

public class a24 {
    public static void main(String[] args) {
        String[]aves=new String[]{"白鹭","黄鹂","鹦鹉","乌鸦","喜鹊","布谷鸟","斑鸠"};
        int index=0;
        System.out.println("我的院子里有好多鸟，大约包括：");
        while(index< aves.length){
            System.out.println(aves[index++]);
        }
    }
}
