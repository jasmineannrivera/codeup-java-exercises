import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        String message = "";
        Scanner sc = new Scanner(System.in);
        System.out.printf("\n\nTalk to Bob\n");
        do {
            System.out.print("\nType text to Bob: ");
            message = sc.nextLine();

            if (message == null || message.length() == 0) {
                System.out.println("Fine. Be that way!");
                continue;
            }
            char c = message.charAt(message.length()-1);
            switch (c) {
                case '?':
                    System.out.println("Sure.");
                    break;
                case '!':
                    System.out.println("Whoa, chill out!");
                    break;
                default:
                    System.out.println("Whatever.");
                    break;
            }

        } while (!message.equals("Bye."));
        System.out.printf("\n\nGoodbye\n\n");
        sc.close();
    }
}
