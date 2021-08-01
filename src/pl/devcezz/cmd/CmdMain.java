package pl.devcezz.cmd;

import java.util.Scanner;

public class CmdMain {

    public static void main(String[] args) {
        Program program = new Program();
        program.printOptions();

        Scanner scanner = new Scanner(System.in);
        int cmdNumber;
        do {
            cmdNumber = -1;
            System.out.print("> ");
            String cmd = scanner.nextLine();
            try {
                cmdNumber = Integer.parseInt(cmd);
                program.handleChoice(cmdNumber);
            } catch (NumberFormatException exception) {
                System.out.println("Please type number of command");
                program.printOptions();
            } catch (IllegalArgumentException exception) {
                System.out.println("Unknown command");
                program.printOptions();
            }
        } while (program.stillRunning(cmdNumber));
    }
}
