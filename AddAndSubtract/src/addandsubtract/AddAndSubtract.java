package addandsubtract;

public class AddAndSubtract {
    
    /**
     *
     * @param number1 integer to add
     * @param number2 integer to add
     * @return number1 + number2
     */
    public static int sumIntegers(int number1, int number2) {
        return number1 + number2;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number1 = Integer.valueOf(args[0]);
        int number2 = Integer.valueOf(args[1]);
        System.out.println(args[0] + " + " + args[1] + " = " + sumIntegers(number1, number2));
    }
    
}
