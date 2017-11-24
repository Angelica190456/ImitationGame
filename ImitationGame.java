 public class ImitationGame
{
   public static void main(String[] args) {
       Cipher myText = new Cipher("potato");
       myText.cipherCode(); 
       
       Decipher newText = new Decipher("tbvtbhf");
       newText.decipherCode();
   }
}
