/*Given a 32-bit signed integer, reverse digits of an integer.
 * Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21

int	32 bits	-2,147,483,648 .. ……..  2,147,483,647
*/

/*To handle string to int conversion when string to convert exceeds max int
https://stackoverflow.com/questions/9451066/how-to-detect-overflow-when-convert-string-to-integer-in-java
*/
public class ReverseOfAnInteger {	
	public int reverse(int x) {
		boolean negative = false;
		int result=0;
			
            String num =Integer.toString(x);
            if(num.charAt(0)=='-') {
            	negative = true;
            	num = num.substring(1, num.length());
            }
            StringBuilder sb= new StringBuilder();
            for(int i=num.length()-1;i>=0;i--) {
            		sb.append(num.charAt(i));
            	
            }
           
            if(negative) {
        		sb.insert(0,"-");
        	}
            
            try {
            	result= Integer.parseInt(sb.toString());
            }catch(NumberFormatException e) {
            	return 0;
            }
            return result;	 
	
	}
       
	
	
	public static void main(String args[]) {
		ReverseOfAnInteger obj =new ReverseOfAnInteger();
		int num = obj.reverse(200);
		System.out.println(num);
		int num2 = obj.reverse(-122);
		System.out.println(num2);
		int num3 = obj.reverse(1534236469);
		System.out.println(num3);
		int num4 = obj.reverse(122);
		System.out.println(num4);
	}



}
