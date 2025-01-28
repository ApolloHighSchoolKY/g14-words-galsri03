import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Words
{
	private ArrayList<Word> wordList;

	public Words()
	{
		wordList = new ArrayList<>();
	}

	public Words(String s)
	{
		wordList = new ArrayList<>();
		setWords(s);
	}

	public void setWords(String s)
	{
		//Create a Scanner for the list of words in the string "s"
		Scanner scan = new Scanner(s);

		//Continue to loop while there are more words to read
		while(scan.hasNext())
			//Add objects of the type Word to our ArrayList "wordList"
			wordList.add(new Word(scan.next));

	}

	public int countWordsWithXChars(int size)
	{
		int count=0;

		//for every Word in the ArrayList "wordList"
		for(Word word: wordList)
			//if the length of the "theWord" is the same as the parameter "size"

			//ok mr. leohr i'm lost. why recursive loop calling the method itself?
			// i think we want to count words with specfic length so this line gets 5 big booms: BOOM BOOM BOOM BOOM BOOM
			//if(theWord.length()==countWordsWithXChars(size))
		return count;
	}

	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
		int vowelCount = 0;

		//for each Word in the ArrayList "words" loop

			//if the Word has "size" characters


		return vowelCount;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;

		//for every Word in the ArrayList "words"

			//if the number of vowels in "theWord" is the same as the parameter "numVowels"


		return count;
	}

	public String toString()
	{
	   return "";
	}
}