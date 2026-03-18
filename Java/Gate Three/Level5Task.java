import java.util.Arrays;

public class Level5Task {

    public static int[] completeArray(int[] input, int length) {
        int[] output = new int[length];

       
        for (int count = 0; count < output.length; count++) {
            output[count] = -1;
 }


        for (int count = 0; count < input.length && count < length; count++) {
            output[count] = input[count];
}

        return output;
}

    public static void main(String[] args) {
        System.out.println(Arrays.toString(completeArray(new int[]{10, 11, 12}, 5)));
        System.out.println(Arrays.toString(completeArray(new int[]{10, 11, 12, 13, 14}, 2)));
        System.out.println(Arrays.toString(completeArray(new int[]{}, 4)));
  }
}




















































































