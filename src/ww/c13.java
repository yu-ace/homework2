package ww;

public class c13 {
    public static void main(String[] args) {
        int a[] = {1,2,3,0,8,9,1,2,67,0,8,9,0,0,0,0,0,0,0,1,23};
        int c = 0;
        for(int i = 0;i < a.length;i++){
            if(a[i] == 0){
                c++;
            }
        }
        System.out.println(c);
    }
}
