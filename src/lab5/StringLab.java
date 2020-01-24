package lab5;
/*
 * @author jeanniemccarthy
 */

import java.util.Scanner;

public class StringLab {
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		StringMethods stringMethodsObject = new StringMethods();
		String word;
		String phrase;
		int waldoAt;
		String string1, string2, inOrder;
		String reverseThisWord;
		StringBuilder wordReversed;
		String word1, word2, reOrder;
		String afterMath;
		String letterized;
		String camelizedPhrase;
		
		System.out.println("Enter a word in all caps: ");
		word = scnr.nextLine();
		
		word = stringMethodsObject.capitalize(word);
		System.out.println(word);
		
		System.out.println("Enter a phrase with Waldo hiding somewhere:");
		phrase = scnr.nextLine();
		waldoAt = stringMethodsObject.wheresWaldo(phrase);
		System.out.println(waldoAt);
		
		System.out.println("Enter two words:");
		string1 = scnr.next();
		string2 = scnr.next();
		inOrder = stringMethodsObject.firstThingsFirst(string1, string2);
		System.out.println(inOrder);
		
		System.out.println("Enter a word for reversal:");
		reverseThisWord = scnr.next();
		//String [] wordArr = reverseThisWord.split("");
		wordReversed = stringMethodsObject.reverse(reverseThisWord);
		System.out.println(wordReversed);
		
		System.out.println("Enter two words:");
		word1 = scnr.next();
		word2 = scnr.next();
		reOrder = stringMethodsObject.soLong(word1, word2);
		System.out.println(reOrder);
		
		System.out.println("Enter a phrase that may or may not have the word \"math\" somewhere in there:");
		scnr.nextLine();
		phrase = scnr.nextLine();
		afterMath = stringMethodsObject.afterMath(phrase);
		System.out.println(afterMath);
		
		System.out.println("Enter a word to letterize:");
		word = scnr.nextLine();
		letterized = stringMethodsObject.letterize(word);
		System.out.println(letterized);
		
//		System.out.println("Enter a phrase:");
//		phrase = scnr.nextLine();
//		//System.out.println(camelizedPhrase);
		
//		String firstWord = phrase.substring(0, phrase.indexOf(" "));//you could take this first word substring and use it 
//		//later to replace (0, firstWord.length())
//		String[] phraseSplit = phrase.split(" ");
//		String wordCamel = "";
//		for (String wordC : phraseSplit) {
//			wordCamel = wordCamel.toUpperCase();
//			wordCamel = wordCamel.substring(0,2) + word.substring(1).toLowerCase();	
//		}
//		System.out.println(wordCamel);
		
		//String wordLetter1 = phrase.replace(phrase.charAt(phrase.indexOf(" ")+1), Character.toUpperCase(phrase.charAt(phrase.indexOf(" ")+1))) ;
		//System.out.println(wordLetter1);
	}

}
