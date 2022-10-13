package work;

public class n2 {
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
            int a=i;
            for(int j=0;j<10;j++){
                int b=j;
                for(int n=0;n<10;n++){
                    int c=n;
                    if(100*a+10*b+c==a*a*a+b*b*b+c*c*c){
                        System.out.println(100*a+10*b+c);
                    }
                }
            }
        }
    }
}
