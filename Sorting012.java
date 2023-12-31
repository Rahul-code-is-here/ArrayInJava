package ArraysinJava;

public class Sorting012 {
    public static void sorting012(int arr[], int n){
        int low=0;
        int mid=0;
        int high=n-1;
        int temp=0;
        while(mid<=high){
            switch(arr[mid]){

                case 0:{
                    temp=arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    temp=arr[high];
                    arr[high]=arr[mid];
                    arr[mid]=temp;
                    high--;
                    break;
                }
            }
        }
    }

    public static void main(String[] args){
        int arr[]={0,1,0,1,2,1,0};
        int n=arr.length;
        sorting012(arr, n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]);
        }
    }
}
