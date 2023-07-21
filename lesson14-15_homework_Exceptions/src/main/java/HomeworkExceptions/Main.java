package HomeworkExceptions;

import HomeworkExceptions.Exceptions.WrongLoginException;
import HomeworkExceptions.Exceptions.WrongPasswordException;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws WrongLoginException {
        Scanner scanner = new Scanner(System.in);
        String login, pass, confpass;
        boolean a = false;
        System.out.println("Please type your login.");
        login = scanner.nextLine();
        System.out.println("Please type your password.");
        pass = scanner.nextLine();
        System.out.println("Please type your password again.");
        confpass = scanner.nextLine();
        try {
            System.out.println(CheckAuthLogin(login));
            System.out.println(CheckAuthPasswords(pass, confpass));
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }

    }

    public static boolean CheckAuthLogin(String login) throws WrongLoginException {

        if (login.length() < 20 && login.contains("_")) {
            System.out.println("Login is correct");
            return true;
        } else {
            throw new WrongLoginException("Wrong login! :( -> Please add '_' in your login, or/and use less than 20 characters. Thanks! ^_^", "Hello");
        }
    }

    public static boolean CheckAuthPasswords(String password, String confirmPassword) throws WrongPasswordException {
        if (password.length() < 20 && password.contains("_") && password.contains("!")) {
            if (password.equals(confirmPassword)) {
                System.out.println("Passwords are correct");
                return true;
            } else {
                throw new WrongPasswordException("Passwords are not the same, please try again");
            }
        } else {
            throw new WrongPasswordException("Wrong password! :( -> Please add '_' and '!' in your login, or/and use less than 20 characters. Thanks! ^_^");
        }
    }
}