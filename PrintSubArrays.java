package ArraysinJava;

public class PrintSubArrays {
    public static void printsubarray(int numbers[]){
        int count=0;
        for(int i=0; i<=numbers.length-1; i++){
            for(int j=i; j<=numbers.length-1; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(numbers[k] + " ");
                }

                count++;
                System.out.println();
            }
        }
        System.out.println("total numbers of subArrays is" + " " +count);
    }

    public static void main(String[] args){
        int numbers[]={2,4,6,8,10};
        printsubarray(numbers);
    }
}
