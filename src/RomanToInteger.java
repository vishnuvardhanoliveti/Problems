/*Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, two is written as II in Roman numeral, just two one's added together. 
Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.

Example 1:

Input: "III"
Output: 3
Example 2:

Input: "IV"
Output: 4
Example 3:

Input: "IX"
Output: 9
Example 4:

Input: "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 5:

Input: "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.*/

/* inserting multiple entries into map
 	https://stackoverflow.com/questions/8261075/adding-multiple-entries-to-a-hashmap-at-once-in-one-statement
 */

/*https://stackoverflow.com/questions/2288937/what-does-it-mean-the-serializable-class-does-not-declare-a-static-final-serial
*/
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	Map<Character,Integer> map =new HashMap<Character,Integer>()
			{{
				put('I', 1);
			    put('V', 5);
			    put('X', 10);
			    put('L',50);
			    put('C', 100);
			    put('D', 500);
			    put('M',1000);
			    
			}};
			
			 public int romanToInt(String s) {
				
				 int result=0;
				 for(int i=0;i<s.length();i++) {	
					 if(i==0) {
						 result += map.get(s.charAt(i));
					 }
					 
					 else if((map.get(s.charAt(i))==5||map.get(s.charAt(i))==10)&&(map.get(s.charAt(i-1)) ==1)){
						 result = result+map.get(s.charAt(i))-2;
					 }
					 
					 else if((map.get(s.charAt(i))==50||map.get(s.charAt(i))==100)&&(map.get(s.charAt(i-1)) ==10)){
						 result = result+map.get(s.charAt(i))-20;
					 }
					 
					 else if((map.get(s.charAt(i))==500||map.get(s.charAt(i))==1000)&&(map.get(s.charAt(i-1)) ==100)){
						 result = result+map.get(s.charAt(i))-200;	
					 }
					 
					 else
					 {
						 result += map.get(s.charAt(i));
					 }
					 
				 }
			       return result; 
			    }
	public static void main(String[] args) {
		RomanToInteger obj = new RomanToInteger();
		int result = obj.romanToInt("MCMXCIV");
		System.out.println(result);
		int result1 = obj.romanToInt("IL");
		System.out.println(result1);

	}

}
