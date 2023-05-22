
    import java.util.Scanner;

    public class OddEven {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            int evenCount = 0;
            int oddCount = 0;

            while (number != 0) {
                int digit = number % 10;
                if (digit % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
                number /= 10;
            }

            System.out.println("The Even digits are: " + evenCount);
            System.out.println("The Odd digits are: " + oddCount);
        }
    }


