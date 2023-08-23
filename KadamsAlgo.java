package ArraysinJava;

public class KadamsAlgo {   //O(n^2) time complexity
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

    public static void kadanes(int numbers[]){
        int max_sum=Integer.MIN_VALUE;  // max. sum = minus infinite
        int current_sum=0; //current sum=0;

       for (int i=0; i<=numbers.length-1; i++){
           current_sum= current_sum+ numbers[i];
           if (current_sum<0){
               current_sum=0;
           }
           max_sum= Math.max(current_sum,max_sum);
       }
       System.out.println("max sum is:" +" "+ max_sum);
    }

    public static void main(String[] args){
        int numbers[]= {1,-2,6,-1,3};
        //PrefixSum(numbers);
        kadanes(numbers);
    }
}
