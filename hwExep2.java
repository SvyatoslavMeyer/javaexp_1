package exeptL1.hwExep1;
import java.util.Random;

public class hwExep2 {
    public static void main(String[] args) {
        int[] firstArray = getFilledArray(2);
        int[] secondArray = getFilledArray(3);

        int[] divArray = divArrays(firstArray, secondArray);
    }

    public static int[] divArrays(int[] firstArray, int[] secondArray) {
        if(firstArray.length != secondArray.length) throw new RuntimeException("Массивы разной длинны");
        int[] resultArr = new int[firstArray.length];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = firstArray[i] - secondArray[i];
        }
        return resultArr;
    }

    public static int[] getFilledArray(int length){
        int[] array = new int[length];
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = rnd.nextInt(20);
        }
        return array;
    }
}
