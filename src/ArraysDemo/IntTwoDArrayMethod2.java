package ArraysDemo;

public class IntTwoDArrayMethod2 {

    public static void main(String[] args) {

        int[][] a = {
                {11,22,33},
                {21,32,43},
                {10,20,30},
                {99,98,97}
        };

      //  int[][] a1 = {{11,22,33},{21,32,43},{10,20,30} };

        for (int i=0;i<a.length;i++)
        {
            for (int j = 0 ; j<a[0].length;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
