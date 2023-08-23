package ArraysinJava;

public class ArrayShift {
    public static void ShiftAll0(int arr[],int n){
        int count=0;
        for(int i=0; i<n; i++){
           if(arr[i]!=0){
               arr[count]=arr[i];
               count++;
           }
        }
        for(int i=count; i<n; i++){
            arr[i]=0;
        }
    }
    public static void main(String[] args){
        int arr[]={2,0,4,6,0,8,10};
        int n=arr.length;
        ShiftAll0(arr,n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }
    }
}
