package ArraysinJava;

public class MaxSubArraysSum {
    public static void Maxsubarrays(int numbers[]){
        int currSum=0;
        int Max_Sum=Integer.MIN_VALUE; // MINUS INFINITE
        for(int i=0; i<=numbers.length-1; i++ ){
            for(int j=i; j<=numbers.length-1; j++){
                currSum=0;
                for(int k=i; k<=j; k++){
                   // System.out.println(numbers[k]);
                    currSum= currSum+numbers[k];
                }
                System.out.println(currSum);
                if(Max_Sum < currSum){
                    Max_Sum=currSum;
                }
               // System.out.println();
            }
          //  System.out.println();
        }
        System.out.println("total sum is :"+" "+ Max_Sum);
    }

    public static void main(String[] args){
        int numbers[]={2,4,6,8,10};
        Maxsubarrays(numbers);
    }
}
