public class sorting {

    static int[] swap( int[] array, int i, int j){

        int holder = array[i];
        array[i] = array[j];
        array[j] = holder;

        return array;
    }

    static void displayArray(int[] array){

        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println("}");

    }


    static int[] bubbleSort(int[] unsorted) {
        boolean sorted = false;

        while(!sorted){

            sorted = true;
        for (int i = 0; i < unsorted.length - 1; i++) {
            if (unsorted[i] > unsorted[i + 1]) {
                unsorted = swap(unsorted, i, i + 1);
                sorted =false;

            }
        }
    }



            return unsorted;


    }


}
