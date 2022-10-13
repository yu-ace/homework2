package d24;

public class a9 {
    public static void main(String[] args) {
        int a[] = {4,1,2,5,3,2,8};
        int b[] = {12,3,1,9,2};
        int c[] = new int[12];
        for(int i = 0;i <a.length;i++){
            c[i] = a[i];
        }
        for(int i = a.length;i < c.length;i++){
            c[i] = b[i - 7];
        }
        for(int i = 0 ;i <c.length;i++){
            int max = c[i];
            for(int j = 0;j <c.length;j++){
                if(max < c[j]){
                    max = c[j];
                    c[j] = c[i];
                    c[i] = max;
                }
            }
        }
        for(int i = 0;i <c.length;i++){
            int d = c[i];
            System.out.print(d+"\t");
        }
    }
}
