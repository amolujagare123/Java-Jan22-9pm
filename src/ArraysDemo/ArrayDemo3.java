package ArraysDemo;

public class ArrayDemo3 {

    public static void main(String[] args) {

        String[] str = new String[5];

        str[0] = "amol";
        str[1] = "Anjali";
        str[2] = "Harshal";
        str[3] = "Karan";
        str[4] = "Prafulla";
        System.out.println(str.length);
        for(int i=0 ; i<str.length ;i++ )
           System.out.println(str[i]);

    }
}
