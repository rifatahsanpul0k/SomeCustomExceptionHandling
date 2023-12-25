import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Age handling
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        try{
            validAge(age);
        } catch (InvalidInputException e){

            e.printStackTrace();
        }
    }
    public static void validAge(int age) throws InvalidInputException{
        if (age<0){
            throw new InvalidInputException("Please enter a valid age; A positive number.");
        } else {
            System.out.println("Successfully added the age.");
        }
    }
}