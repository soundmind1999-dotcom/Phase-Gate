public class Level4Tasks{

  
    public static int addTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
  }

   
    public static boolean checkEvenNumber(int number) {
        return number % 2 == 0;
    }

  
    public static int squareOfANumber(int number) {
        return number * number;
    }

    
    public static double temperatureConverter(double celsius) {
        return (celsius * 9/5) + 32;
    }


    public static int largestOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        int largest = firstNumber;

        if (secondNumber > largest) {
            largest = secondNumber;
        }

        if (thirdNumber > largest) {
            largest = thirdNumber;
        }

        return largest;
    }


    public static double simpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

   
    public static boolean numberIsPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int count  = 2; count <= Math.sqrt(number); count++) {
            if (number % count == 0) {
                return false;
            }
        }

        return true;
    }

 
    public static void multiplicationTable(int number) {
        for (int count = 1; count <= 10; count++) {
            System.out.println(number + " x " + count + " = " + (number * count));
        }
    }

    
    public static int areaOfRectangle(int length, int width) {
        return length * width;
    }

    
  
    public static void main(String[] args) {

        System.out.println(addTwoNumbers(2, 3));              
        System.out.println(checkEvenNumber(4));               
        System.out.println(squareOfANumber(5));              
        System.out.println(temperatureConverter(0));         
        System.out.println(largestOfThreeNumbers(3, 7, 5));   
        System.out.println(simpleInterest(1000, 5, 2));       
        System.out.println(numberIsPrime(7));                

        multiplicationTable(5);

        System.out.println(areaOfRectangle(4, 6));         
    }
}
