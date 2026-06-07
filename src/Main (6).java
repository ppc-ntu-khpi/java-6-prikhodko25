import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = {
                {5, 2, 9},
                {1, 9, 3},
                {7, 4, 2}
        };

        System.out.println("Matrix:");
        Arrays.stream(matrix)
                .forEach(row -> System.out.println(Arrays.toString(row)));

        int result = Matrixwork.findSecondMax(matrix);

        System.out.println("Second max = " + result);
    }
}