package l2.sort;

import java.util.Objects;
import java.util.function.BiFunction;

public final class SortAlgorithms {
    private SortAlgorithms() {
        // Suppress default constructor for "noneinstantiability"
        throw new AssertionError();
    }

    // This function mutates array
    public static <T> void bubbleSort(T[] items, Direction sortDirection, BiFunction<T, T, Integer> predicate) {
        T[] array = Objects.requireNonNull(items);
        BiFunction<T, T, Integer> compare = predicate == null ? SortAlgorithms::compare : predicate;
        boolean isSwapped;
        Direction dir = sortDirection == null ? Direction.ASC : sortDirection;

        do {
            isSwapped = false;

            for (int i = 0; i < array.length - 1; i++) {
                Integer compareResult = compare.apply(array[i], array[i + 1]);

                if (dir == Direction.ASC ? compareResult > 0 : compareResult < 0) {
                    isSwapped = SortAlgorithms.swap(array, i, i + 1);
                }
            }
        } while (isSwapped);
    }

    private static <T> Integer compare(T a, T b) {
        return a.toString().compareTo(b.toString());
    }

    private static <T> boolean swap(T[] array, int i, int j) {
        if (i < 0 || i > array.length - 1 || j < 0 || j > array.length - 1 || i == j) {
            return false;
        }

        T tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;

        return true;
    }

    enum Direction {ASC, DSC}
}
