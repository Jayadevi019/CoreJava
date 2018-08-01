public class Password_validator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pass="Jaya@1013";
		
		int upp_count=0,dig_count=0,spa_count=0,spl_count=0;
		char arr[]=pass.toCharArray();
		int len=arr.length;
		for(int i=0;i<arr.length;i++)
		{
			char c=arr[i];
			if(Character.isUpperCase(c))
			{ upp_count=1;
			}
			if(Character.isDigit(c))
			{ dig_count=1;
			}
			if(Character.isWhitespace(c))
			{
				spa_count=1;
			}
		    else {
					spl_count=1;
				
			}
				
		}

		if(len>=5 && len<=10 && upp_count==1 && dig_count==1&& spa_count==0 && spl_count==1)
		{
			System.out.println("Valid Password");
		}
		else {
			System.out.println("Invalid password");
		}
	}

}
