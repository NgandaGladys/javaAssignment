      public class Count {
        public static void main(String[] args) {
            // Number
            int number = 123456;

            // Initialize the count variable as 0
            int count = 0;

            while (number != 0) {
                number /= 10;
                count++;
            }

            System.out.println("The number of digits is: " + count);
        }
    }


