package edu.pnu.admin;
import java.util.Scanner;
enum Command {ADD, FIND, CLEAR, LIST, QUIT, INVALID}


public class FCTest {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        FootballClub chealsea = new FootballClub("Chelsea");
        while(true) {
            final Command cmd = getCommand(scanner);
            if(cmd == Command.QUIT) {
                System.out.println("BYE");
                break;
            }
            if(cmd == Command.INVALID) {
                System.out.println("Invalid Operation!");
                continue;
            }
            switch(cmd) {
                case ADD: {
                    Player newPlayer = createPlayer();
                    chealsea.addPlayer(newPlayer);
                    break;
                }

                case FIND: {
                    findPlayer(chealsea);
                    break;
                }

                case CLEAR: {
                    chealsea.removeAllPlayer();
                    break;
                }

                case LIST: {
                    System.out.println(chealsea);
                    break;
                }

                default: break;
            }
        }
    }

    private static Command getCommand(Scanner scanner) {
        System.out.print("Enter Command String! ");
        final String commandName = scanner.next();
        Command command;

        try {
            command = Command.valueOf(commandName.toUpperCase());
        }
        catch (IllegalArgumentException e) {command = Command.INVALID;}
        return command;
    }

    private static void findPlayer(final FootballClub fc) {
        final String playerFirstName = scanner.next();
        final int jerseyNumber = scanner.nextInt();
        final Player foundPlayer = fc.findPlayer(playerFirstName, jerseyNumber);
        if(foundPlayer != null) {
            System.out.println(foundPlayer);
        }
        else {
            System.out.println("Player Not Found with name " + playerFirstName + " and number " + jerseyNumber);
        }
    }

    private static Player createPlayer() {
        final String playerFirstName = scanner.next();
        final String playerLastName = scanner.next();
        final int jersyNumber = scanner.nextInt();
        return new Player(playerFirstName, playerLastName, jersyNumber);
    }

}
