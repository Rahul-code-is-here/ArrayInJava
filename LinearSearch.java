package ArraysinJava;

import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int arr[],int n,int key){
        if(arr==null)
            return  -1;
        for(int i=0; i<n; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        System.out.println("enter the key:");
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
    }
}
