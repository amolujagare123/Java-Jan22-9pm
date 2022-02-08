package StringDemos;

public class SpitDemo2 {

    public static void main(String[] args) {

        String str = "Hey baby you are so lovely";
        String[] stArr = str.split(" ");

        // print only the words that ends with y
        for (int i=0;i< stArr.length;i++) {

            String tempStr = stArr[i];
            int l = tempStr.length();

           // if(stArr[i].charAt(stArr[i].length()-1)=='y')

            if(tempStr.charAt(l-1)=='y')
            System.out.println(stArr[i]);
        }

    }
}
