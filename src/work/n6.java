package work;

public class n6 {
    public static void main(String[] args) {
        int []a={1,2,3,4};
        int b;int c;int d;int e=0;
        for(int i=1;i<=a.length;i++){
            b=i;
            for (int k=1;k<=a.length;k++){
                c=k;
                for(int n=1;n<=a.length;n++){
                    d=n;
                    if(b!=c && b!=d && c!=d){
                        e++;
                        System.out.print(100*b+10*c+d+"\t");
                    }
                }
            }
        }
        System.out.println("\n"+"能组成"+e+"互不相同且无重复数字的三位数");
    }
}
