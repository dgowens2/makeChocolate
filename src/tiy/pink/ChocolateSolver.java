package tiy.pink;

/**
 * Created by DTG2 on 08/24/16.
 */
public class ChocolateSolver {

    public int makeChocolate(int small, int big, int goal) {
        int bigValue = big * 5;

        if (goal == bigValue)
            return 0;
        else if (goal > bigValue) {
            if (goal > (bigValue + small))
                return -1;
            else if (goal == (bigValue + small))
                return small;
            else
                return goal - bigValue;
        } else {
            while (goal < bigValue) {
                bigValue -= 5;
            }
            if (goal > bigValue + small)
                return -1;
            else
                return goal - bigValue;
        }
    }
}
