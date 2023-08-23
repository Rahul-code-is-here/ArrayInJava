package ArraysinJava;

public class SubArraySumUsingPrefix {   //O(n^2) time complexity
    public static void PrefixSum(int numbers[]){
        int currSum=0;
        int max_term=Integer.MIN_VALUE;
        int[] prefix= new int[numbers.length];

        prefix[0]= numbers[0];
        //calculatting prefix array
        for(int i=1; i<numbers.length; i++){
            prefix[i]= prefix[i-1]+ numbers[i];
        }

        for(int i=0; i<=numbers.length-1; i++){   // i= start and j= end
            for(int j=i; j<=numbers.length-1; j++){
                currSum= i == 0 ? prefix[j] :   prefix[j] - prefix[i-1];

                if(max_term< currSum){
                   max_term= currSum;
                }

            }

        }
        System.out.println("the sum is using prefix" + " " + max_term);

    }

    public static void main(String[] args){
        int numbers[]= {1,-2,6,-1,3};
        PrefixSum(numbers);
    }
}
