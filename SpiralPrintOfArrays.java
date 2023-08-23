package ArraysinJava;

public class SpiralPrintOfArrays {
    public static void Spiralprint(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;

        while(startRow<=endRow && startCol<=endCol){
            // uper ni boundry print.. row same reshe column change thashe 0 to end - 1;
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]);
            }
            // baju  ni last line
            for(int i=startRow+1; i<=endRow; i++) {
                System.out.print(matrix[i][endCol]);
            }
            // nicheni botton line
            for(int j=endCol-1; j>=startCol; j--){
                 if(startCol == endCol){ //last ma ek box j vadhyu to top print karti vakhate e aavi jashe and right side ma condition satisfied nai thai but nicheni line vakhate fari print na thai jay etle condition muki
                    break;
                }
                System.out.print(matrix[endRow][j]);
            }
           // lest line
            for(int i=endRow-1; i>=startRow+1; i--){
                System.out.print(matrix[i][startRow]);
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
    }

    public static void main(String[] args){
        int matrix[][] = { {1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};
        Spiralprint(matrix);
    }
}
