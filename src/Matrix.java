import java.util.Arrays;

/**
 * Клас для роботи з матрицями.
 * Містить метод для знаходження другого за величиною елемента.
 */
public class Matrixwork {

    /**
     * Знаходить друге за величиною число в матриці.
     *
     * @param matrix вхідна матриця (int[][])
     * @return друге за величиною число
     * @throws IllegalArgumentException якщо елементів менше ніж 2
     */
    public static int findSecondMax(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            throw new IllegalArgumentException("Matrix is empty");
        }

        // "Сплющуємо" матрицю в масив
        int[] flatArray = Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .toArray();

        if (flatArray.length < 2) {
            throw new IllegalArgumentException("Not enough elements");
        }

        // Сортуємо
        Arrays.sort(flatArray);

        // Йдемо з кінця, шукаємо перше відмінне від максимального
        int max = flatArray[flatArray.length - 1];

        return Arrays.stream(flatArray)
                .filter(x -> x < max)
                .max()
                .orElseThrow(() -> new IllegalArgumentException("All elements are equal"));
    }
}