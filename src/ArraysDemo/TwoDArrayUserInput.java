package ArraysDemo;

import java.util.Scanner;

public class TwoDArrayUserInput {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter rows = ");
        int row = s.nextInt();

        System.out.println("Enter Columns = ");
        int col = s.nextInt();

        int[][] a = new int[row][col];

        for(int i=0;i<row;i++)
        {
            for (int j=0;j<row;j++)
            {
                System.out.println("a["+i+"]["+j+"] = ");
                a[i][j] = s.nextInt();
            }
        }

        System.out.println("below is the array");

        for(int i=0;i<row;i++)
        {
            for (int j=0;j<row;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }


    }
}
