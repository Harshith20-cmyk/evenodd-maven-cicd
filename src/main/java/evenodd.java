public class evenodd {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java -jar evenodd.jar <number>");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);
            System.out.println(number + (isEven(number) ? " is even." : " is odd."));
        } catch (NumberFormatException exception) {
            System.out.println("Please provide a valid integer.");
            System.exit(1);
        }
    }
}
