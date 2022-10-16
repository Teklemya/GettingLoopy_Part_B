public class t3
{
    public static void main(String[] args)
    {
        final int ROW = 4;
        final int COL = 4;

        for (int row = 4; row >= 0; row--) {

            for (int col = row; col >= 0; col--) {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}
