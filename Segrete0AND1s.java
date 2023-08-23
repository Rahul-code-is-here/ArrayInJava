package ArraysinJava;

public class Segrete0AND1s {
    public static void segrete(int num[],int n){

        int count=0;
        for(int i=0;i<n;i++){
            if(num[i]==0) {
                count++;
            }
        }
        for(int i=0; i<count; i++){
            num[i]=0;
        }
        for(int i=count; i<n; i++){
            num[i]=1;
        }
    }

    public static void main(String[] args){
        int num[]={0,0,1,1,0,1,0,0,1};
        int n=num.length;
        segrete(num,n);
        for(int i=0; i<n; i++){
            System.out.print(num[i]);
        }
    }
}
