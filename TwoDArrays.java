package ArraysinJava;

import java.util.Scanner;

public class TwoDArrays {
    public static boolean Search(int matrix[][], int key){
     //   int largest=Integer.MIN_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.print("key is found at"+ "(" + i +","+ j + ")");
                    return true;
                }
            }
        }
        System.out.println(" key is not found");
        return false;
    }

    public static void main(String[] args){
        int matrix[][]= new int[3][3];
        int n=matrix.length; int m=matrix[0].length; // matrix[0] = length at 0th index
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        Search(matrix, 5);
    }
}
