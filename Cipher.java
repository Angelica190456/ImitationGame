import java.util.Scanner;

public class Cipher
{
    private String decodedText = "";
    private int num1;
    private int num2;
    
    public Cipher(String text) {
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
    
    public void cipherCode() {
        System.out.println("Encryption");
         
        System.out.println("Type the starting place for where you want to encrypt your code from (write in terms of array indexes): ");
        pickRange1();
        
        System.out.println("Type the ending place for where you want to stop encrypting your code (write in terms of array indexes): ");
        pickRange2();
        
        String newWord = decodedText.substring(num1, num2);
        
        if((num1 >= 0) && (num2 < decodedText.length() && (num1 <= num2))) {
            for(int x = num1; x < num2; x++) {
               char letter = newWord.charAt(x);
               int ascii = (int) letter+1;
               char newLetter = (char) ascii;
               System.out.print(newLetter);
           }
        }
        
        else {
            System.out.println("Error! Ensure that your first number is smaller than the second and that you are typing the numbers in the array index form!");
        }
        
        System.out.println("");
    }
    
}
