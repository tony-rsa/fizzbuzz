package za.co.wethinkcode.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public String checkNumber(int number) {
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;

        if (divisibleBy3 && divisibleBy5)
            return "FizzBuzz";

        if ( divisibleBy3 || divisibleBy5 )
            return divisibleBy3 ? "Fizz" : "Buzz";

        return String.valueOf(number);
    }


    public String countTo(int number) {
        List<String> countedList = new ArrayList<>();

        for (int i = 1; i < number + 1; i++)
            countedList.add(checkNumber(i));

        return countedList.toString();
    }
}
