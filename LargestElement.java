package ArraysinJava;
import java.util.*;



public class LargestElement {
    public static  int getLargest(int number[]){
        int largest= Integer.MIN_VALUE; // - INFINITY
        int smallest= Integer.MAX_VALUE; // + INFINITY
        for(int i=0; i<number.length; i++){
            if (largest < number[i]){
                largest= number[i];

            } if(smallest> number[i]){
                smallest= number[i];
            }
        }
        System.out.println("the smallest value is" + smallest); //RETURN EK J VALUE THAY ETLE PRINT
        return largest;
    }
    public static void main(String[] args){
        int number[]={1,2,6,3,5};
        int Larger = getLargest( number);

        System.out.println("the largest element is"+ Larger );
    }
}
