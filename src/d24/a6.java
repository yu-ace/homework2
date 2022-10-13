package d24;

public class a6 {
    public static void main(String[] args) {
        int a[] = {4,7,1,9,3};
        int b = 0;int c = 0;int d = 0;int e = 0;
        for(int i = 0;i < a.length;i++){
            for(int k = 0;k <a.length ;k++){
                b = a[k];
                for(int j =0;j <a.length;j++){
                    c = a[j];
                    for(int n = 0;n <a.length;n++){
                        d = a[n];
                        if( b != c && b != d && c != d){
                            e++;
                            System.out.print(100 * b + 10 * c +d + "\t");
                        }
                    }
                }
            }

        }
        System.out.println("\n"+e);
    }
}
