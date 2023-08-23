package ArraysinJava;

public class Sort012 {
    public static void sort012(int arr[], int n){
        int count=0;
        int count2=0;
        for(int i=0; i<n; i++){
            if(arr[i]==0) count++;
            else if(arr[i]==1) count2++;
        }
        for(int i=0; i<count; i++){
            arr[i]=0;
        }
        for(int i=count; i<count+count2; i++){
            arr[i]=1;
        }
        for(int i=count+count2; i<n; i++){
            arr[i]=2;
        }
    }
    public static void main(String[] args){
        int arr[]={0,1,2,1,1,0,2,1,0,0};
        int n=arr.length;
        sort012(arr,n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]);
        }
    }
}
