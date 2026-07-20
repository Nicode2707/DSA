public class DiamondPattern {
    public static void main(String[] args) {

        int n = 5;

        // Upper Half
        for (int row = 1; row <= n; row++) {

            // Spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            // Stars
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower Half
        for (int row = n - 1; row >= 1; row--) {

            // Spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            // Stars
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}