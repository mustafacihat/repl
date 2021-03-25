package repl;

import java.util.Scanner;

public class Repl17PrintVariable7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String topic1 = scan.nextLine();
		String topic2 = scan.nextLine();

		if (topic1.equals("Java")) {
			System.out.println("I will learn \"" + topic1 + "\" and \"" + topic2 + "\" at CybertekSchool.");
		} else {
			System.out.println("I will learn " + topic1 + "and " + topic2 + "at CybertekSchool");
		}

	}

}
