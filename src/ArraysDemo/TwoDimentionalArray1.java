package ArraysDemo;

import java.util.Scanner;

public class TwoDimentionalArray1 {

    public static void main(String[] args) {



        int[][] a = new int[5][3];

        a[0][0] =89;
        a[0][1] =19;
        a[0][2] =81;

        a[1][0] =29;
        a[1][1] =39;
        a[1][2] =49;

        a[2][0] =85;
        a[2][1] =87;
        a[2][2] =88;

        a[3][0] =8;
        a[3][1] =9;
        a[3][2] =1;

        a[4][0] =22;
        a[4][1] =44;
        a[4][2] =66;

        int row = a.length;
        int col = a[0].length;

        System.out.println("row="+row);
        System.out.println("col="+col);

        for(int i=0; i<5 ; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
