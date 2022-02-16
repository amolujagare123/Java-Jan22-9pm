import java.util.Arrays;

public class DuplicateNumber {

    public static void main(String[] args) {


        String s = "9654982668";
        char[] arr = s.toCharArray(); //['9', '6', '5', '4', '9', '8', '2', '6', '6', '8']
        int k = arr.length;
        // char[] arrDup = new char[k];
        //   char [] p=new char[k];

        Arrays.sort(arr);

        int temp = 0;
       for (int i = 0; i <= k - 1; i++) {
          //  int isDistinct = 0;
            for (int j = i + 1; j <= k - 1; j++) {

                if (arr[i] == arr[j] ) {


                    if(temp!=arr[i])
                        System.out.println(arr[i]);

                    temp = arr[i];

                    }

                }


            }

        }


    }
