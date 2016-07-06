import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your text here:");
		String text = in.nextLine();
		
		String[] words = text.split("\\s+");
		Arrays.sort(words);
		StringBuilder sb = new StringBuilder();
		for (String word : words) {
			sb.append(word);
			sb.append(" ");
			System.out.print(word + " ");
		}
		in.close();
	}
}