package ArraysinJava;

import java.util.Arrays;
import java.util.Scanner;

public class FirstArrays {
    public static void Sorting(int numbers[]){
        Arrays.sort(numbers);
       System.out.print(numbers);
    }
    public static void main(String[] args){
        int marks []= new int[50];

        int numbers[] ={1,2,3,5,8,4,6};
        int morenumbers[]={4,5,6};
        Sorting(numbers);
    }
}
