public class FPAdder {
    public static void main(String[] args) {
        
        int length = args.length;
        
        if (length >= 2) {
            float sum = 0f;
            for (int i = 0; i < length; i++) {
                sum += Float.valueOf(args[i]).floatValue();
            }
            System.out.printf("Sum of values = %.2f%n", sum);
        } else {
            System.err.println("This program requires minimum two command line argument");
        }
    }
}