public class SortAlgorithms {

    public static void bubbleSort(int [] a) {
        MyTimer.start();
        for (int i: a) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if(a[j] > a[j +1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println();
        for (int i: a) {
            System.out.print(i + " ");
        }
        System.out.println();
        MyTimer.stop();
    }
}