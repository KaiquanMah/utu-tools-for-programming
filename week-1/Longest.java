public class Longest {
    public static void main(String[] inputs) {
        // check for empty input
        if (inputs.length == 0) {
            System.out.println("No parameters");
        }
        else {
            // initialise longest string
            String longest = "";
            
            // input is an array of strings
            // so we loop through each string element
            for (String str: inputs) {
                if (str.length() > longest.length()) {
                    longest = str;
                }
            }
            System.out.println("Longest parameter:  " +longest);
        }
    }
}