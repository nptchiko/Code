import java.io.PrintWriter;

public class printwriter {

	public static void main(String[] args) throws Exception {


            // by importing the java.io.PrintWriter class
		PrintWriter consoleOutput = new PrintWriter(System.out);

        consoleOutput.
		consoleOutput.printf("Hey there! This is %S.\n", "Lubaina Khan");
		consoleOutput.print("Today you're exploring the PrinWriter class with Code Gym. ");
		consoleOutput.println("Hope you're having fun!");
		consoleOutput.append("Patience is the key when learning new concepts.\n");
		consoleOutput.append("It all boils down to practise and persistence. :)");

		consoleOutput.flush();
		consoleOutput.close();
	}
}