package topics.bitmanipulation;

public class DecimalToBinary {

    public static void main(String[] args) {
        int n = 8;
        String result = convert(n);
        int result1 = convertTo(n);
        System.out.println(result);
        System.out.println(result1);
    }

    //can work for larger numbers
    public static String convert(int n){
        StringBuilder result = new StringBuilder();

        while(n>0){
            int rem = n%2;
            result.append(rem);
            n = n/2;
        }

        return result.reverse().toString();
    }

    public static  int convertTo(int n){
        int result = 0;

        while(n>0){
            int rem = n%2;
            result = result*10+rem;
            n = n/2;
        }

        return result;
    }
}
