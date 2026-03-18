public class Level6Task {

    public static String numberingCharacter(String input) {

        String output = "";
        int count = 1;

        for (int letter = 1;  letter < input.length(); letter++) {
              if (input.charAt(letter) == input.charAt(letter - 1)) {
                count++;
     } else {
                output = output + input.charAt(letter - 1) + count;
                count = 1;
}
        }

        output = output + input.charAt(input.length() - 1) + count;

            return "\"" + output + "\""; 
    }

    public static void main(String[] args) {
        System.out.println(compressString("AaaBBc"));     
        System.out.println(compressString("EEEEnnneee"));  
        System.out.println(compressString("oooooYOO"));   
  }
}




















































































