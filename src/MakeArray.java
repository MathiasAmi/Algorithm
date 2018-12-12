public class MakeArray {

    public static int[] makeReversedArray(int size) {
        int[] numbers = new int[size];

        for (int i = 1; i < size + 1; i++) {
            numbers[i - 1] = size - i;
        }
        return numbers;
    }
}
