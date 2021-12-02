import java.lang.Math;
import java.util.Scanner;
enum Command {ADD, LIST, AVG, SUM, STD, QUIT, InvalidC};

public class ArrayEnum {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int[] values = new int[100];
        int index = 0;

        while(true) {
            final Command command = getCommand(scanner);
            if( command == Command.QUIT) {
                System.out.println("Bye!");
                break;
            }
            switch(command) {
                case ADD:
                    final int newValue = getValue(scanner);
                    values[index] = newValue;
                    index++;
                    break;
                case LIST:
                    printList(values, index);
                    break;
                case AVG:
                    System.out.printf("%.2f%n", getAvg(values, index));
                    break;
                case SUM:
                    System.out.println(getSum(values, index));
                    break;
                case STD:
                    System.out.printf("%.2f%n", getStd(values, index));
                    break;
                case InvalidC:
                    System.out.println("Invalid Command");
            }
        }
        scanner.close();
        return;
    }

    private static int getSum(int[] values, int index) {
        int sum = 0;
        for(int i=0; i<index; i++) {
            sum = sum + values[i];
        }
        return sum;
    }

    private static double getAvg(int[] values, int index) {
        int sum = getSum(values, index);
        double avg = sum/index;
        return avg;
    }

    private static double getStd(int[] values, int index) {
        double avg = getAvg(values, index);
        double sumd = 0;
        for (int i=0; i<index; i++) {
            sumd = sumd + Math.pow(avg-values[i],2);
        }
        double std = Math.sqrt(sumd/index);
        return std;
    }


    private static void printList(int[] values, int index) {
        for(int i=0; i<index; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println("");
    }

    private static int getValue(Scanner scanner) {
        final int newValue = scanner.nextInt();
        return newValue;
    }

    private static Command getCommand(Scanner scanner) {
        final String commandName = scanner.next();
        Command command;

        try {
            command = Command.valueOf(commandName.toUpperCase());
        }
        catch (IllegalArgumentException e) {command = Command.InvalidC;}
        return command;
    }
}
