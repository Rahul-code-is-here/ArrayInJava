package ArraysinJava;

public class ArayyCC {
    public static int Linearsearch(int number[],int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int number[]={2,4,6,8,10,12,14,16};
        int key=10;

        int index=Linearsearch(number,key);
        if(index== -1){
            System.out.print("data not found");
        } else {
            System.out.print("key at index" + index);
        }
    }
}
