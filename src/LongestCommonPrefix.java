/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:
Input: ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: ["dog","racecar","car"]
Output: ""

Explanation: There is no common prefix among the input strings.
Note:
All given inputs are in lowercase letters a-z.*/
/*
https://stackoverflow.com/questions/7869810/java-lang-arrayindexoutofboundsexception-0-array-larger-than-index

https://stackoverflow.com/questions/10818232/java-string-index-out-of-range-1
*/

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		StringBuilder result = new StringBuilder();
		int firstStringIterator=0;
		char found=' ';
		int size=strs.length;
		//First check if array is empty
		if(size>0 && strs[0].length()>0) {
			while(firstStringIterator<strs[0].length()) {
				found = strs[0].charAt(firstStringIterator);
				int otherIterator=1;
				//Start from second string in array to find if you have common prefix as first
				for(int i=1;i<size;i++) {
					//Make sure that rest of the  strings in array have length  greater than the index position of the character i.e firstStringIterator from first string
					if(strs[i].length()>firstStringIterator && strs[i].charAt(firstStringIterator)==found) {
						otherIterator++;
					}
							
				}
				if(otherIterator == size)
				result = result.append(strs[0].charAt(firstStringIterator));
				else	
				break;
				
				firstStringIterator++;
			}
		}
		
		return result.toString();
	}

	public static void main(String[] args) {
		LongestCommonPrefix obj = new LongestCommonPrefix();
		
		String result = obj.longestCommonPrefix(new String[] {"flower","flow","flight"});
		System.out.println(result);
		String result2=obj.longestCommonPrefix(new String[] {"dog","racecar","car"});
		System.out.println(result2);
		String result3=obj.longestCommonPrefix(new String[] {"aa","a","aaa"});
		System.out.println(result3);
	    String result4=obj.longestCommonPrefix(new String[] {"aa","a","aaa"});
		System.out.println(result4);
	}

}
