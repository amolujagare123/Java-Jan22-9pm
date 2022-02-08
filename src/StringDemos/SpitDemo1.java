package StringDemos;

public class SpitDemo1 {

    public static void main(String[] args) {

        String str = "This is a Java class";
        String[] stArr = str.split("i");

        for (int i=0;i< stArr.length;i++)
            System.out.println(stArr[i]);

    }
}
