package d24;

public class a15 {
    public static void main(String[] args) {
        int a[] = {1,2,3,0,8,9,1,2,67,0,8,9,0,0,0,0,0,0,0,1,23};
        int b[] = new int[100];
        for(int i =0;i <a .length;i++){
            int iw = a[i];
            b[iw] = b[iw] + 1;
        }

        int max = b[0];
        int c = 0;
        for(int i =0;i <b.length;i++){
            if(b[i]>max){
                max = b[i];
                c = i;
            }
        }
        System.out.println(c);
    }
}
