package util;

import java.util.Scanner;
// create scanner
public class Input {
    private Scanner scanner;
// make scanner public and accessible?
    public Input() {
        this.scanner = new Scanner(System.in);
    }
// create message for inside print statement
    public String getString() {
        return getString("Enter a string: ");
    }
// method overloading to print message and take user input to store as variable
    public String getString(String prompt) {
        String answer;
        System.out.println(prompt);
        answer = this.scanner.next();
        System.out.println(answer);
        return answer;
    }
    public boolean yesNo(){
        return yesNo("yes or no?");
    }

    public boolean yesNo(String prompt){
        String answer;
        System.out.println(prompt);
        answer = this.scanner.next();
        return answer.toLowerCase().startsWith("y");
    }

}


