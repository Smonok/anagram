import java.util.Arrays;

public class Anagram {
	
	 public static String reverseEveryWord(String original){
				
		 	final String SPLIT_KEEPING_SPACES = "(?<= )|(?= )";
		 	String[] splitStr = original.split(SPLIT_KEEPING_SPACES);
			char[] symbol; 
			int[] position;						
						
			for(String splitted: splitStr) {
				StringBuilder word = new StringBuilder(splitted);
				symbol = new char[word.length()];
				position  = new int[word.length()];
				int index = 0;
				for(int j = 0; j < word.length(); j++) {
					if(!Character.isLetter(word.charAt(j))) {
						symbol[index] = word.charAt(j);
						position[index] = j;
						index++;
					}						
				}
				
				for(int i = index - 1; i >= 0; i--)
					word.deleteCharAt(position[i]);
				
				word.reverse();
				
				for(int i = 0; i < index; i++)
					word.insert(position[i], symbol[i]); 				
			}
						
			return String.join("", splitStr);
	 }	
}