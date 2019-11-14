package addandsubtract;

public class AddAndSubtract {
    
    /**
     * Adds Integers
     * @param number1 integer to add
     * @param number2 integer to add
     * @return number1 + number2
     */
    public static int addIntegers(int number1, int number2) {
        return number1 + number2;
    }
    
    /**
     * Subtracts integers
     * @param number1 integer to subtract
     * @param number2 integer to subtract
     * @return number1 - number2
     */
    public static int subtractIntegers(int number1, int number2) {
        return number1 - number2;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number1 = Integer.valueOf(args[0]);
        int number2 = Integer.valueOf(args[1]);
        System.out.println(args[0] + " + " + args[1] + " = " + addIntegers(number1, number2));
        System.out.println(args[0] + " - " + args[1] + " = " + subtractIntegers(number1, number2));
    }
    
}
