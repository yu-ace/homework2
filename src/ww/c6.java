package ww;

public class c6 {
    public static void main(String[] args) {
        int a = 0;
        for(int i = 1;i <= 4;i++){
            for(int j = 1;j <= 4;j++){
                for(int n = 1;n <= 4;n++){
                    if(i != j && i != n && j != n){
                        System.out.print(100 * i + 10 * j +n + "\t");
                        a++;
                    }
                }
            }
        }
        System.out.println("\n"+a);
    }
}
