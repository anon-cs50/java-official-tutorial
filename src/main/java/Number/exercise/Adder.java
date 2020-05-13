package Number.exercise;

public class Adder {
    public static void main(String[] args) {
        
        int length = args.length;
        
        if (length >= 2) {
            int sum = 0;
            for (int i = 0; i < length; i++) {
                sum += Integer.valueOf(args[i]).intValue();
            }
            System.out.printf("Sum of values = %d%n", sum);
        } else {
            System.err.println("This program requires minimum two command line argument");
        }
    }
}