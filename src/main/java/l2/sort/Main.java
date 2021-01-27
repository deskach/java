package l2.sort;

public class Main {
    public static void main(String[] args) {
        Integer[] testArray = {9, 8, 6, 5, 0, 4, 9, 2};

        SortAlgorithms.bubbleSort(testArray, SortAlgorithms.Direction.DSC, (a, b) -> a - b);
        Main.printArray(testArray);
    }

    private static void printArray(Integer[] array) {
        for(Integer num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
