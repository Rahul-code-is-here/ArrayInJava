package ArraysinJava;

import java.util.Scanner;

public class Binary2 {
    public static int binarySearch(int arr[],int n,int key){
        int start=arr[0]; int end=arr[n-1];
        int mid=(start+end)/2;
        while(start<end){
            if(arr[mid]==key) {
                return mid;
            }
           else if(arr[mid]>key){
                end=mid-1;
            }
           else {
               start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        //System.out.println("enter the key");
       // Scanner sc=new Scanner(System.in);
       // int key=sc.nextInt();
        int key=2;
        int k= binarySearch(arr,n,key);
        System.out.println("key is found at "+ k);
    }
}
