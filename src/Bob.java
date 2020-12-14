import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Bob {
//    public static void main(String[] args) {
//        String message = "";
//        Scanner sc = new Scanner(System.in);
//        System.out.printf("\n\nTalk to Bob\n");
//        do {
//            System.out.print("\nType text to Bob: ");
//            message = sc.nextLine();
//
//            if (message == null || message.length() == 0) {
//                System.out.println("Fine. Be that way!");
//                continue;
//            }
//            char c = message.charAt(message.length()-1);
//            switch (c) {
//                case '?':
//                    System.out.println("Sure.");
//                    break;
//                case '!':
//                    System.out.println("Whoa, chill out!");
//                    break;
//                default:
//                    System.out.println("Whatever.");
//                    break;
//            }
//
//        } while (!message.equalsIgnoreCase("bye"));
//        System.out.println("\n\nGoodbye\n\n");
//        sc.close();
//

        //Create date format converter application.
        //Take in the following format:
        //MM/DD/YYYY
        //Output the following:
        //MonthName DD, YYYY
        //Example:
        //input - 12/01/1999
        //output - December 12, 1999


    public static void dateConverter() {
        String format = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nEnter a date\n");
        format = sc.nextLine();
        int month = parseInt(format.substring(0,2));
        int day = parseInt(format.substring(3,5));
        int year = parseInt(format.substring(6,10));
        String date = "";

        switch (month) {
            case 1:
                date += "January";
                break;
            case 2:
                date += "February";
                break;
            case 3:
                date += "March";
                break;
            case 4:
                date += "April";
                break;
            case 5:
                date += "May";
                break;
            case 6:
                date += "June";
                break;
            case 7:
                date += "July";
                break;
            case 8:
                date += "August";
                break;
            case 9:
                date += "September";
                break;
            case 10:
                date += "October";
                break;
            case 11:
                date += "November";
                break;
            case 12:
                date += "December";
                break;



        }
        System.out.printf("%s %d, %d",date,day,year);;

    }

    public static void main(String[] args) {
        dateConverter();
    }
}


