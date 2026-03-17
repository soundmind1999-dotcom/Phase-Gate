import java.util.Scanner;
public class TaskFour{

    public static void main (String [] args){

    Scanner input = new Scanner (System.in);
    System.out.println("Enter a number: ");
    int number = input.nextInt();

    int times = 0;
    int result = 0;
    
    for (int count = 1; count <= 10; count++){
    times = number * count;

    
        System.out.println("%d X %d = %d" number, count, times);
}
    
}
    








}




