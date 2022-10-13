package work;

public class a14 {
    public static void main(String[] args) {
        int a[] = {1,2,3,0,8,9,1,2,67,0,8,9,0,0,0,0,0,0,0,1,23};
        int max = 0;
        int b = 0;
        for(int i = 0;i <a.length;i++){
            if(max < a[i]){
                max = a[i];
                b = i;
            }
        }
        System.out.println("最大的数是："+max);
        System.out.println("下标是："+b);
    }
}
