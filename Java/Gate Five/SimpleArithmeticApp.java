//set count = 1
//set number of correct answers = 0
//while count <= 10
//generate first number randomly between 1 and 100
//generate second number randomly between 1 and 100
//
//while second number is less than firstNumber 
//generate second number again between 1 and 100
//    
//
//set correct answer equals first number minus second number
//
//display first number minus second number
//
//prompt user to enter answer
//
//while answer is not equal to correct answer
//display the question again
//prompt user to answer again
//increment count by 1
//increment the number of attempts by 1
//display you scored number of correct answer out of 10


import java.util.Scanner;
import java.util.Random;

public class SimpleArithmeticApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int count = 1;
        int numberOfCorrectAnswers = 0;

        while (count <= 10) {

        System.out.println("Question " + count);

            int firstNumber = random.nextInt(11);   
            int secondNumber = random.nextInt(11); 

            while (secondNumber > firstNumber) {
                secondNumber = random.nextInt(11);
  }

            System.out.printf("%d - %d = ", firstNumber, secondNumber);
            int answer = input.nextInt();

            if ((firstNumber - secondNumber) != answer) {
                System.out.printf("%d - %d = ", firstNumber, secondNumber);
                answer = input.nextInt();
     }

            if ((firstNumber - secondNumber) == answer) {
                numberOfCorrectAnswers++;
 }

            count++;

}

        System.out.printf("You scored %d out of 10%n", numberOfCorrectAnswers);
  }
}






