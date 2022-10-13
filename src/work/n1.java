package work;

public class n1 {
    public static void main(String[] args) {
        for(int a=2;a<100;a++){
            if(shu(a)==true){
                System.out.print(a+"\t");
            }
        }
    }

    public static boolean shu(int n){
        for(int a=2;a<n;a++){
            if(n % a ==0 ){
                return false;
            }
        }return true;
    }
}
