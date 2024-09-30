public class Main {
    public static void main(String[] args) {
        double[] cgpas = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        selectionSortDescending(cgpas);
        System.out.println("Sorted CGPAs in descending order:");
        for (double cgpa : cgpas) {
            System.out.println(cgpa + " ");
        }
    }
    public static void selectionSortDescending(double[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            double temp = array[maxIndex];
            array[maxIndex] = array[i];
            array[i] = temp;
        }
    }
    }
