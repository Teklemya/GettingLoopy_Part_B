public class s2
{
    public static void main(String[] args)
    {
        final int ROW = 4;
        final int COL = 4;

        for (int row = 0; row <= 4; row++) {

            for (int col = 0; col <= row; col++) {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}

