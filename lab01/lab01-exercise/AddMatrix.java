public class AddMatrix {
    public static void main(String[] args) {
        int[][] firstMatrix = {
                {1,2},
                {3,4}
        };
        int[][] secondMatrix = {
                {5,6},
                {7,8}
        };
        int[][] sumMatrix = new int[2][2];

        for (int r = 0; r < 2; r++) {
            for (int c = 0; c < 2; c++) {
                sumMatrix[r][c] = firstMatrix[r][c] + secondMatrix[r][c];
            }
        }
        print2dArray(firstMatrix);
        print2dArray(secondMatrix);

        print2dArray(sumMatrix);
    }

    private static void print2dArray(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                System.out.print(matrix[r][c] + "\t");
            }
            System.out.println();
        }
    }
}
