

public class RomanNumerals {
	
	private static final int[]    VALUES  = { 1000, 900,  500, 400,  100, 90,   50,  40,   10,  9,    5,   4,    1   };
	private static final String[] SYMBOLS = { "M",  "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
	
	public static String convertToInteger(int romanNum) throws InvalidFormatException{
		
		StringBuilder result = new StringBuilder();
		int remaining=romanNum;
		for (int i = 0; i < VALUES.length; i++) {
			remaining = appendRomanNumerals(remaining, VALUES[i], SYMBOLS[i], result);
		  }
		String res=result.toString();
		//int check= valuechecking(res);

			return res;
		 //return result.toString();
		    
	}
	private static int appendRomanNumerals(int arabic, int value, String romanDigits, StringBuilder builder) {
		  int result = arabic;
		  while (result >= value) {
		    builder.append(romanDigits);
		    result -= value;
		  }
		  return result;
		}
 
	public int valuechecking(String res) throws InvalidFormatException
	{
		int I=0, x=0,c=0,m=0,v=0,l=0,d=0;
		for (int i = 0 ; i != res.length() ; i++) {
		    char ch = res.charAt(i);
		    if(ch=='I') 
		    	I=I+1;
		    else if(ch=='X')
		    	x=x+1;
		    else if(ch=='C')
		    	c=c+1;
		    else if(ch=='M')
		    	m=m+1;
		    else if(ch=='V')
		    	v=v+1;
		    else if(ch=='L')
		    	l=l+1;
		    else if(ch=='D')
		    	d=d+1;
			}
		
		 if(I>3 ||x>3||c>3||m>3||l>1||v>1||d>1)
			 throw new InvalidFormatException();
		 else 
			 return 0;
		
	}
}
