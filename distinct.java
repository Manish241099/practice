public class distinct {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        System.out.println("Distinct elements between the two arrays are:");

        // Find and print elements unique to array1
        for (int i = 0; i < array1.length; i++) {
            boolean isDistinct = true;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    isDistinct = false;
                    break;
             }
            }
            if (isDistinct) {
                System.out.println(array1[i]);
            }
        }

        // Find and print elements unique to array2
        for (int i = 0; i < array2.length; i++) {
            boolean isDistinct = true;
       for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                System.out.println(array2[i]);
            }
        }
    }
}