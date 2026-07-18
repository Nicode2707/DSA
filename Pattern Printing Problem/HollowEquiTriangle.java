public class HollowEquiTriangle {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            // Print leading spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            // First and last row
            if (row == 1 || row == n) {

                for (int col = 1; col <= 2 * row - 1; col++) {
                    System.out.print("* ");
                }

            } else {

                // Left boundary
                System.out.print("* ");

                // Hollow spaces
                for (int col = 1; col <= 2 * row - 3; col++) {
                    System.out.print("  ");
                }

                // Right boundary
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}