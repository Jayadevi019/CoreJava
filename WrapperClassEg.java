public class WrapperClassEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sample="This is Example 1 **** ";
		char c[]=sample.toCharArray();
		for(int i=0;i<c.length;i++)
		{
		char x=c[i];
		if(Character.isDigit(x))
		{
			System.out.println(x+" is a DIGIT");
		}
		else if(Character.isLetter(x))
		{
			System.out.println(x+" is a LETTER");
		}
		else if(Character.isWhitespace(x))
		{
			System.out.println(x+" is a Whitespace");
		}
		else
		{
			System.out.println(x+" is a Special Character");
		}
		
		}
		

	}

}
