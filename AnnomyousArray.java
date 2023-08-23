package ArraysinJava;


public class AnnomyousArray {
    public static void sum(int[] a){
        int sum=0;
        for(int i : a){
            sum=sum+i;
        }
        System.out.println("the sum is: "+ sum);
    }
    public static void main(String[] args){
           sum(new int[]{1,2,3});
    }
}
