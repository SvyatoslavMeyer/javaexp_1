package exeptL1.hwExep1;

public class hwExep1 {
    private static void printDivisionZero() {
        System.out.println(1 / 0);
    }

    private static void fillArray() { 
        int[] number = new int[3];
        for (int i = 0; i < number.length + 1; i++) {
            number[i] = i;
        }
    }

    private static void convertStringToNumber() { 
        String likeNumber = "o";
        int number = Integer.parseInt(likeNumber);
    }
}
