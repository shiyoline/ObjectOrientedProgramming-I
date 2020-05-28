import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));
    }


    public static int[] copy(int[] array) {
        int[] copiedArrays = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copiedArrays[i] = array[i];
        }

        return copiedArrays;
    }

    public static int[] reverseCopy(int[] array){
        int[] reversedArray = new int[array.length];
        int reverse = array.length-1;

        for (int i = 0; i < array.length; i++){
            reversedArray[i] = array[reverse];
            reverse--;
        }

        return reversedArray;
    }
}