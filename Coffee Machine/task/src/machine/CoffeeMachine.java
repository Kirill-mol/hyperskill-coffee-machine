package machine;

import java.io.InputStream;
import java.io.PrintStream;

public class CoffeeMachine {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        PrintStream printStream = System.out;

        Terminal terminal = new Terminal(inputStream, printStream);

        Machine machine = new StateCoffeeMachineLauncher(
                new StateCoffeeMachine(terminal),
                terminal);

        machine.run();
    }
}
