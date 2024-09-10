package Arrays;

import java.util.Arrays;

public class ArraysPracticeOne {

    public static void main(String [] args){
        int[] intArray;
        intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        //System.out.println(Arrays.toString(intArray));

        String sArray[] = {"a","b","c"};
        //System.out.println(Arrays.toString(sArray));

        SingleDimesionArray singleDimesionArray = new SingleDimesionArray(10);
        singleDimesionArray.insert(6,11);
        singleDimesionArray.insert(12,120);
        singleDimesionArray.insert(1,10);
        singleDimesionArray.insert(1,30);


        var firstElement = singleDimesionArray.arr[0];
        System.out.println("first element in array: "+firstElement);

       // singleDimesionArray.traverseArray();
        //singleDimesionArray.searchInArray(11);

        singleDimesionArray.delteValue(0);
        singleDimesionArray.traverseArray();



    }




































}
