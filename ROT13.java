import java.util.Scanner;

public class ROT13 {

    final static String inputs = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
    final static String outputs = new String("NOPQRSTUVWXYZABCDEFGHIJKLMnopqrstuvwxyzabcdefghijklm");

    static String encrypt(String plainText)
    {
        StringBuilder cipher = new StringBuilder();
        char[] ptArray = plainText.toCharArray();
        for(char x : ptArray){
            int index = inputs.indexOf(x);
            if(index != -1){
                cipher.append(outputs.charAt(index));
            }else{
                cipher.append(x);
            }
        }
        return cipher.toString(); 
    }

    static String decrypt(String cipher)
    {
        StringBuilder originalText = new StringBuilder();
        char[] cipherArray = cipher.toCharArray();
        for(char x : cipherArray){
            int index = outputs.indexOf(x);
            if(index != -1){
                originalText.append(inputs.charAt(index));
            }else{
                originalText.append(x);
            }
        }
        return originalText.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Plain Text: ");
        String pt = sc.nextLine();
        String cipher = encrypt(pt);
        System.out.println("Encrypted Text: " + cipher);
        String originalText = decrypt(cipher);
        System.out.println("Decrypted Text: " + originalText);
    }
}
