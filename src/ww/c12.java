package ww;

public class c12 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        for(int i = 0;i < a.length/2;i++){
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
        for(int i = 0;i <a.length;i++){
            int b = a[i];
            System.out.print(b+"\t");
        }
    }
}
