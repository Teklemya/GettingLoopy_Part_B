public class s6
{
    public static void main(String[] args)
    {
        final int ROW = 4;
        final int COL = 4;

        for (int row = 4; row >= 0; row--) {

            for (int col = row; col >= 0; col--) {
                System.out.printf("*");
            }
            for (int col = 1; col >= 0; col--) {
                System.out.printf("*");
            }
            System.out.println("");
        }
        for (int row = 6; row >= 5; row--) {
            System.out.printf("*");
        }
        for (int row = 3; row >= 3; row--) {
            System.out.printf("");
        }
    }
}
