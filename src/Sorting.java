public class Sorting {

    public static int linearSearch(int a, int[] b) {
        for (int i = 0; i < b.length; i++) {
            if (b[i] == a)
                return i;
        }
        return -1;
    }
}



