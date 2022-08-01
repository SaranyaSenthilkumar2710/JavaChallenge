package week4.JavaChallange;

public class LastWordLength {

	public static void main(String[] args) {


		String sentence = "Hello World ";
		int length =0;

		if (sentence == null || sentence.length() == 0 || sentence.equalsIgnoreCase(" ")) {
			length = 0;
		}else {
			// Split the sentence into words on space.
			String[] words = sentence.split("\\s+");
			// getting the last word and send itd length
			length = words[words.length - 1].length();
		}
		System.out.println("Given Sentence :" +sentence);
		System.out.print("Length of the last word :");
		System.out.print(length);
	}
}

