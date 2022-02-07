package ArraysDemo;

public class StringTwoDArrayMethod2 {

    public static void main(String[] args) {

        String[][] stArr = {

                {"abc1","pqr1","xyz1"},
                {"abc2","pqr2","xyz2"},
                {"abc3","pqr3","xyz3"},
                {"abc4","pqr4","xyz4"},

        };

      //  int[][] a1 = {{11,22,33},{21,32,43},{10,20,30} };

        for (int i=0;i<stArr.length;i++)
        {
            for (int j = 0 ; j<stArr[0].length;j++)
            {
                System.out.print(stArr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
