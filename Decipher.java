import java.util.Scanner;

public class Decipher
{
    private String decodedText = "";
    private int num1;
    private int num2;
    
    public Decipher(String text) {
        decodedText = text;
    }
    
    private int pickRange1() {
        Scanner range1 = new Scanner(System.in);
        num1 = range1.nextInt();
        return num1;
    }
    
    private int pickRange2() {
        Scanner range2 = new Scanner(System.in);
        num2 = range2.nextInt()+1;
        return num2;
    }
    
    public void decipherCode() {
        System.out.println("Decryption");
        
        System.out.println("Type the starting place for where you want to decrypt your code from (write in terms of array indexes): ");
        pickRange1();
        
        System.out.println("Type the ending place for where you want to stop decrypting your code (write in terms of array indexes): ");
        pickRange2();
        
        String newWord = decodedText.substring(num1, num2);
        
        if((num1 >= 0) && (num2 < decodedText.length())) {
            for(int x = num1; x < num2; x++) {
               char letter = newWord.charAt(x);
               int ascii = (int) letter-1;
               char newLetter = (char) ascii;
               System.out.print(newLetter);
           }
        }
        
        else {
            System.out.println("Error! Ensure you are typing the numbers in terms of the array indexes!");
        }
        
        System.out.println("");
    }
}
