import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        System.out.println("Please enter something");
        String userInput = eb.nextLine();

        System.out.println("You entered: " + userInput);
        if(StringUtils.isNumeric(userInput)) {
            System.out.println("This is a number");
        }else {
            System.out.println("This is not a number");
        }

        System.out.printf("Flipped Case: %s\n", StringUtils.swapCase(userInput));
        System.out.printf("Reversed: %s\n", StringUtils.reverse(userInput));


    }


}
