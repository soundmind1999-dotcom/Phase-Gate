






import java.util.Scanner;
import java.security.SecureRandom;

public class SimpleArithmeticApp{
    public static void main (String [] args){

    Scanner input = new Scanner (System.in);

    SecureRandom secureRandom = new SecureRandom;

    int count = 1;
    while (count <= 10){

    
    System.out,printf("Question %d" count);
    int firstNumber = secureRandom.nextInt(1000) + 1;
    int secondNumber = secureRandom.nextInt(1000) + 1;
    while (secondNumber > firstNumber){
    secondNumber = secureRandom.nextInt(1000) + 1;

}

  int numberOfAttempts = 0;
    while(numberOfAttempts <= 2){
        System.out.printf("%d - %d = ", firstNumber, secondNumber);

        int answer = input.nextInt();
      
        if (firstNumber - secondNumber != answer){

        System.out.printf("%d - %d = ", firstNumber, secondNumber);

        answer = input.nextInt();


} 
        if (firstNumber - secondNumber == answer){
        numberOfAttempts++
}

}
        count++




}





























}














}

