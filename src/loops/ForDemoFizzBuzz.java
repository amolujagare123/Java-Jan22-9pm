package loops;

public class ForDemoFizzBuzz {

    public static void main(String[] args) {
       // print 1 to 10 numbers and write even or odd in front of them

        for(int i =1; i<=30 ;i++)
        {  // 15 or 30
            if(i%3==0 && i%5==0)
             System.out.println(i+" FizzBuzz");

           else  if(i%5==0)
               System.out.println(i+" Buzz");

           else if(i%3==0)
               System.out.println(i+" Fizz");
           else
               System.out.println(i);
        }
    }
}
