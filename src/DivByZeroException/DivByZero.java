import java.util.Scanner;

public class DivByZero {
    public static void main(String[] args) {
        int a,b, result = 0;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        try {
            validNumber(b);
            result = a/b;
        } catch (DivideByZeroException e){
            e.printStackTrace();
        } finally {
            System.out.println(result);
        }

    }
    public static void validNumber(int number)throws DivideByZeroException{
        if (number==0){
            throw new DivideByZeroException("The denominator can't be zero. Please try again");
        } else {
            System.out.println("Number is valid");
        }
    }
}
