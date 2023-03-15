public class Main {
    public static void main(String[] args) {


int[] firstArray = {7,11,101,55,-4,100,32,2,27907200,16,117,-5,-250,19,72,-96};

        sorting.displayArray(firstArray);

        int[] sortedArray = sorting.bubbleSort(firstArray);

        sorting.displayArray(sortedArray);
    }
}