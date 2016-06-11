import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter text: ");
		String text = input.nextLine();
		System.out.println("Enter word: ");
		String word = input.nextLine();

		String[] parts = text.split("\\. ");
		for (String part : parts) {
			if (part.contains(word)) {
				System.out.println(part);
			}
		}

		System.out.println();
		input.close();
	}
}
