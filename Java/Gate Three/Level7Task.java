public class Level7Task {

     public static int[] findLargestIndexPosition(double[][] store) {
     
        double largestValue = store[0][0];
        int rowIndex = 0;
        int colIndex = 0;

    
           for (int count = 0; count < store.length; count++) {
       
              for (int counter = 0; counter < store[count].length; counter++) {
                 if (store[count][counter] > largestValue) {
                    largestValue = store[count][counter];
                    rowIndex = count;
                    colIndex = counter;
}
 

 }
   

 }
            return new int[]{rowIndex, colIndex};
    }

         public static void main(String[] args) {
           double[][] input = { {45.2, 90.28, 77.1}, {3.52, 9.86, 11.77}, {7.7, 10, 22.33, 12} };

        int[] position = findLargestIndexPosition(input);
        System.out.println("Largest value is at row " + position[0] + ", column " + position[1]);

  }
}
