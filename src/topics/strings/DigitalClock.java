package topics.strings;

/*
Digital Clock

You are building a logic for a clock that requires you convert absolute time in minutes into a format supported by a digital clock. See examples below.

125 minutes can be displayed as 2:05

155 minutes can be displayed as 2:35


(You can assume the maximum value of minutes will be less than 24 X 60)

Input

Input is a single integer.

    1180

Output

Output is a string denoting the digital clock time.

    19:40


Hint
You can use the to_string(int)  method to convert an integer into string.

 */

public class DigitalClock {

    public static void main(String[] args) {
        int x = 24*60;
        String result = convertToDigitalTime(x);

        System.out.println(result);
    }

    static String convertToDigitalTime(int minutes){
        int hrs = minutes/60;
        int min = minutes%60;

        return (hrs>23?"00":hrs) + ":" + (min<9 ? "0"+min : Integer.toString(min));

    }
}
