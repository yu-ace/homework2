package ww;

public class c2 {
    public static void main(String[] args) {
        for(int i = 1;i < 10;i++){
            for(int j =0;j <10;j++){
                for(int n = 0;n < 10;n++){
                    if(100 * i + 10 * j + n ==i * i * i + j * j * j + n * n * n){
                        System.out.print(100 * i + 10 * j + n + "\t");
                    }
                }
            }
        }
    }
}
