import java.io.Console;

public class Encryptor {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Enter a phrase to be encrypted.");
    String phrase = myConsole.readLine();

    String myEncryptedResults = encryptPhrase(phrase);
    System.out.println(myEncryptedResults);
  }

  public static String encryptPhrase( String phrase ) {

    return phrase.replaceAll("s", "blah").replaceAll("r", "derp");
  }
}
