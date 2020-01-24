package lab5;
/*
 * @author jeanniemccarthy
 */
public class StringMethods {
	StringBuilder strBuild = new StringBuilder();
	
	public String capitalize(String word) {
		word = word.toUpperCase().charAt(0) + word.substring(1).toLowerCase();
		return word;
	}
	public int wheresWaldo(String phrase) {
		int waldo = phrase.indexOf("Waldo");
		return waldo;
	}
	public String firstThingsFirst(String string1, String string2) {
		String inOrder;
		if (string1.compareTo(string2) <= 0) {
			 inOrder = string1 + " " + string2;
		}
		else {
			inOrder = string2 + " " + string1;
		}
		return inOrder;
	}
	
	public StringBuilder reverse(String wordOriginal) {
		strBuild.append(wordOriginal).reverse();
		return strBuild;
		}
	
	public String soLong(String word1, String word2) {
		String reOrder;
		if (word1.length() > word2.length()) {
			 reOrder = word1;
		}
		else if (word2.length() > word1.length()){
			 reOrder = word2;
		}
		else {
			reOrder = word2 + " " + word1;
		}
		return reOrder;
	}
	
	public String afterMath(String phrase) {
		String afterMath;
		if (phrase.indexOf("math") != -1) {
			afterMath = phrase.substring(phrase.indexOf("math"));
		}
		else {
			afterMath = "dud";
		}
		return afterMath;
	}
	
	public String letterize(String word) {
		String [] arr = word.split("");
		String verticalWord = "";
		for (String letter : arr) {
			verticalWord += letter +"\n";
		}
		return verticalWord;
	}
	
	public String camelized(String phrase) {
		char wordLetter1;
		String camelizedPhrase = "";
		wordLetter1 = phrase.charAt(phrase.indexOf(" ")+1);
		return camelizedPhrase;
	}
}
