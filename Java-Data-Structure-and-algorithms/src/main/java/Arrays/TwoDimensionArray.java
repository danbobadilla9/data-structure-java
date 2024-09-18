package Arrays;

public class TwoDimensionArray {

    int arr[][] = null;

    public TwoDimensionArray(int numberOfRows, int numberOfColumns){
        this.arr = new int[numberOfRows][numberOfColumns];
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    // Inserting value in the array

    public void insertValueInTheArray(int row, int col, int value){
        try{
            if(arr[row][col] == Integer.MIN_VALUE){
                arr[row][col] = value;
                System.out.println("The value is successfully inserted");
            }else{
                System.out.println("This cell is already occupied");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index errror");
        }
    }

    // accediendo a un valor
    public void accessCell(int row, int col){
        System.out.println("\n Accesing row# "+row+" , Col# "+col);
        try{
            System.out.println("Cell value is: "+arr[row][col]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D array");
        }
    }

    // traverse
    public void traverse2DArray(){
        for(int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }













































































































































































































}
