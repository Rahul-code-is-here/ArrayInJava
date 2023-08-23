package ArraysinJava;

public class ArrayDiagonalSum {
    public static int DiagonalSum(int matrix[][]){
        int sum=0;
        for(int i=0; i<matrix.length;i++){
            //primary diagonal
            sum=sum+matrix[i][i];
            //secodary diagonal; i+j=n-1;    i+j=matrix.length-1;
            if(i!=matrix.length-1-i)
            sum=sum+matrix.length-1-i;
        }
        return sum;
    }

    public static void main(String[] args){
        int matrix[][]= {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
       int K= DiagonalSum(matrix);
        System.out.println("the sum is : "+ K);
    }
}
