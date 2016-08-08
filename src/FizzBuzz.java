/**
 * Created by davehochstrasser on 8/7/16.
 */
public class FizzBuzz {


    public static void doIt(int start, int end) {

        for (int x = start; x <= end; x = x + 1) {
                System.out.print(x);
            //For numbers which are multiples of both three and five print "FizzBuzz".

            if ((x % 3 == 0) && (x % 5 == 0)) {
                System.out.print("FizzBuzz");
            }

            //For multiples of three print "Fizz" instead of the number.
            else if (x % 3 == 0) {
                System.out.print("Fizz");

            }
            //For the multiples of five it print "Buzz".

            else if (x % 5 == 0) {
                System.out.print("Buzz");
            }

            //For the multiples of five it print "Buzz".




        }

    }}

