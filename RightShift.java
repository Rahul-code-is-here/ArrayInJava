package ArraysinJava;

public class RightShift {
    public static void rotateArray(int[] arr) {
        int n = arr.length;
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }

    public static void main(String[] args){
        int arr[]={2,4,6,8,10};
        rotateArray(arr);
        for(int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }
   }
}
