package q02_advanced.question03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
	public String inputString() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("input passwprd>>");
		String str = reader.readLine();

		return str;
	}

	public int inputNumber() throws IOException, NumberFormatException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("input id>>");
		String st2 = reader.readLine();
		int num = Integer.parseInt(st2);

		return num;

	}
}
