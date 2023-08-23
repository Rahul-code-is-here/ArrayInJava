package ArraysinJava;

import java.util.Scanner;

public class LarrgestAraay {
    public static void SearchLargest(int matrix[][]){
        int largest= Integer.MIN_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] > largest){
                    largest = matrix[i][j];

                }
            }
        }
        System.out.println("the largest element is "+ largest);
    }

    public static void main(String[] args){
        int matrix[][]= new int[3][3];
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        for(int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        SearchLargest(matrix);
    }
}
