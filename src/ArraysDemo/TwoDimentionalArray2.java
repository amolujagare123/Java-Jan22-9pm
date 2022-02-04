package ArraysDemo;

public class TwoDimentionalArray2 {

    public static void main(String[] args) {

        char[][] ch = new char[3][3];

        ch[0][0] ='h';
        ch[0][1] ='c';
        ch[0][2] ='v';

        ch[1][0] ='s';
        ch[1][1] ='y';
        ch[1][2] ='w';

        ch[2][0] ='z';
        ch[2][1] ='c';
        ch[2][2] ='k';

        int row = ch.length;
        int col = ch[0].length;

        System.out.println("row="+row);
        System.out.println("col="+col);

        for(int i=0; i<ch.length ; i++) { // rows

            for (int j = 0; j < ch[0].length; j++) { // col
                System.out.print(ch[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
