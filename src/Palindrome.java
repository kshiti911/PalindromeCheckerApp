
 public class Palindrome {

     public static void main(String[] args) {

         String input = "madam";
         String reversed = "";

         for (int i = input.length() - 1; i >= 0; i--) {
             reversed = reversed + input.charAt(i);
         }

         System.out.println("Original Text  : " + input);
         System.out.println("Reversed Text  : " + reversed);

         if (input.equals(reversed)) {
             System.out.println("Result         : It is a Palindrome.");
         } else {
             System.out.println("Result         : It is not a Palindrome.");
         }
     }
 }