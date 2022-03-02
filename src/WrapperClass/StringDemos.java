package WrapperClass;

public class StringDemos {

    public static void main(String[] args) {
        String str1 = "12";
        String str2 = "22";
        System.out.println(str1+str2);

        int i1 = Integer.parseInt(str1);
        int i2 = Integer.parseInt(str2);

        System.out.println(i1+i2);

        String str3 = "31.28";
        String str4 = "24.21";
        System.out.println(str3+str4);

        double d1 = Double.parseDouble(str3);
        double d2 = Double.parseDouble(str4);

        System.out.println(d1+d2);

        float f1 = Float.parseFloat(str3);
        float f2 = Float.parseFloat(str4);

        System.out.println(f1+f2);

        String s5 = "false";

        boolean b = Boolean.parseBoolean(s5);

            if (b)
                System.out.println("this is true");
            else
                System.out.println("this is false");

            String s6 = "a";
            char ch = s6.charAt(0);

    }
}
