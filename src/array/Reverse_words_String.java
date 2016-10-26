package array;
/**
 * 
 * @author Madhu Meghana Talasila
 * 
 * Description: Given an input string, reverse the string word by word. A word is defined as a sequence of non-space characters.
 * 
 * The input string does not contain leading or trailing spaces and the words are always separated by a single space.
 * 
 * Example:
 * the sky is blue
 * blue is sky the
 * 
 * solution: Reverse
 */
public class Reverse_words_String {
	
	public static void main(String[] args){
		String s = "the sky is blue";
		s = reverseString(s);
	
		System.out.println(s);
	}

	private static String reverseString(String s) {
		if(s==null || s.toCharArray().length==1)
			return s;
		int start=0, i=0;
		for( ; i<s.length(); i++){
			if(s.charAt(i) == ' '){
				s = reverse(s, start, i);
				start = i+1;
			}
		}
		
		if(start != i)
			s = reverse(s, start, i);
		
		
		return reverse(s, 0, s.length());
	}

	private static String reverse(String s, int start, int end) {
		char[] tempArray = s.toCharArray();
		int i = start;
		int j = end-1;
		
		while(i<j){
			char temp = tempArray[i];
			tempArray[i] = tempArray[j];
			tempArray[j] = temp;
			i++;
			j--;
		}
		
		return new String(tempArray);
	}
}

