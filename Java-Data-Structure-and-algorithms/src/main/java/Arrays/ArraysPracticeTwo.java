package Arrays;

import java.util.Arrays;

public class ArraysPracticeTwo {

    public static void main(String [] args){

        int[][] int2DArray;
        int2DArray = new int[2][2];
        int2DArray[0][0] = 1;
        int2DArray[0][1] = 2;
        int2DArray[1][0] = 3;
        int2DArray[1][1] = 4;
//        System.out.println(Arrays.toString(int2DArray)); // solo funciona para arreglos de una dimesnion
//        System.out.println(Arrays.toString(int2DArray[0]));
//        System.out.println(Arrays.toString(int2DArray[1]));
//        System.out.println(Arrays.deepToString(int2DArray));
//        String s2Darray[][] = {{"a", "b"}, {"c", "d"}};
//        System.out.println(Arrays.deepToString(s2Darray));
        TwoDimensionArray sda = new TwoDimensionArray(3, 3);
        sda.insertValueInTheArray(0,0,19);
        sda.insertValueInTheArray(1,2,5);
        System.out.println(Arrays.deepToString(sda.arr));

    }


}
