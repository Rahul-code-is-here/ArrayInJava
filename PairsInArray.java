package ArraysinJava;

public class PairsInArray {
    public static void PrintPairs(int numbers[]){
        int tp=0;
        for(int i=0; i<numbers.length-1; i++){

            for(int j=i+1; j<numbers.length-1; j++){
                System.out.println("(" + numbers[i]+ "," +numbers[j]+ ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs are"+ "  "+ tp);
    }

    public static void main(String[] args){
        int numbers[]={2,4,6,8,10};
        PrintPairs(numbers);

    }
}  //TOTAL PAIRS= N(N-1)/2;
