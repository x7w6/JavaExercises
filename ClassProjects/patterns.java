class Patterns {
    public static void main(String[] args) {
        // program prints an increaseing/decreasing pattern of numbers

        System.out.println("PATTERN #2: ");
        //outer loop displays rows
        for(int row = 7; row > 1; row--) {

            // inner loop for columns
            for(int col = 1; col < row; col++) {
                System.out.print(col + " ");
            }

            System.out.print("\n");
        }

        System.out.println("\n" + "PROBLEM #3: " );
        // outer loop represents rows
        for(int row = 1; row <= 6; row++) {

            for (int space = 6; space > row; space--) {
                // prints 2 space characters
                System.out.print("  ");
            }

            // prints number based on row
            for (int col = 1; col<= row; col++) {
                System.out.print(col + " ");
            }



            System.out.print("\n");

        }

    }
}