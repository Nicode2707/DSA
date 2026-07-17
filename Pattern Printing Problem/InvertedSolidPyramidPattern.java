public class InvertedSolidPyramidPattern {
    public static void main(String[] args) {
        int n = 4;

        for (int row = 1; row <= n; row++) {

            // Print spaces
            for (int space = 1; space <= row - 1; space++) {
                System.out.print(" ");
            }

            // Print stars
            for (int star = 1; star <= 2 * n - 2 * row + 1; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}