package passwordverifier;

import java.util.Scanner;

public class GetPassword {
    public String getPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type your password: ");
        String password = scanner.nextLine();
        return password;
    }
}
