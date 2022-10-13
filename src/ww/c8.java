package ww;

public class c8 {
    public static void main(String[] args) {
        int a []= {1,2,3,4,5,6};
        for(int i = a.length - 2;i > 0;i--){
            int temp = a[i];
            a[i] = a[i - 1];
            a[i - 1] = temp;
            int temp1 = a[i+1];
            a[i+1] = a[i];
            a[i] = temp1;
        }
        for(int i = 0;i < a.length;i++){
            int b =a[i];
            System.out.print(b+"\t");
        }
    }
}
