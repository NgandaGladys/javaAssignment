public class LargestNumber {
    public static void main(String[] args){

        int num1=4;
        int num2=8;
        int num3=1;

        System.out.println("first number=" + num1);
        System.out.println("second number=" + num2);
        System.out.println("third number=" + num3);

        int largest=num1;
        if(num2>largest){
            largest=num2;
        }
        if(num3>largest){
            largest=num3;
        }
        System.out.println("The largest number is:" + largest);


    }
}
