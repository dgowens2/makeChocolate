package tiy.pink;

/**
 * Created by DTG2 on 08/24/16.
 */
public class StringReverser {
    public String reverseString(String stringToReverse) {
        char[] stringChars = stringToReverse.toCharArray();
        String reversedString = "";
        for (int charIndex = stringChars.length-1; charIndex >= 0; charIndex--) {
            System.out.println(stringChars[charIndex]);
            reversedString += stringChars[charIndex];
        }

//        for (int charIndex = stringChars.length-1; charIndex > 0; charIndex--) {
//            System.out.println(stringChars[charIndex]);
//            reversedString += stringChars[charIndex];
//        }
//        we change ">=" to just ">" and it returned a failed test that didn't include the "S"


//        return stringToReverse; NOT RETURNING THE PROPER RETURN
        return reversedString;

    }

}


