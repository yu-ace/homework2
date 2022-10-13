package d24;

public class a1 {
    public static void main(String[] args) {
        for(int i =2;i < 100;i++){
            if(zs(i) == true){
                System.out.print(i+"\t");
            }
        }
    }

    public static boolean zs(int n){
        for(int i = 2;i < n;i++){
            if( n % i == 0){
                return false;
            }
        }return true;
    }

}
