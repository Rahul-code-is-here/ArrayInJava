package ArraysinJava;

public class MergeSortedArray {
    public static void merge(int arr1[], int arr2[], int n, int m,int arr3[]) {
        int i=0,j=0,k=0;
        while (i<n && j<m){
            if(arr1[i]<arr2[j]){
                arr3[k++]=arr1[i++];
            }
            else{
                arr3[k++]=arr2[j++];
            }
        }
        while(i<n){
            arr3[k++]=arr1[i++];
        }
        while(j<m){
            arr3[k++]=arr2[j++];
        }
    }
    public static void main(String[] args){
        int arr1[]= {1,3,5,7};
        int arr2[]={2,4,6,8,10};
        int n=arr1.length;
        int m=arr2.length;
        int arr3[]= new int[m+n];
        merge(arr1,arr2,n,m,arr3);
        for(int i : arr3){
            System.out.println(i);
        }
    }
}
