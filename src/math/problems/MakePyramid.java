package math.problems;

public class MakePyramid {
    public static void printTriangle ( int n)
    {
        int k = 4 * n -4;
        for (int i=0; i<n; i++)
        {
            for (int j = 0; j<k; j++)
            {
                System.out.print(" ");
            }
            k = k-1;
            for (int j = 0; j <= i; j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */
        int n = 4;
        printTriangle(n);
        }
  }
