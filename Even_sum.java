/*Author: G Jayadevi
 * Date : 21-07-18*/
public class Even_sum {

	public static void main(String []args)
	{
		 int a=12,b=20,c=33,even_sum=0;
			if(a%2==0)
				even_sum+=a;
			if(b%2==0)
				even_sum+=b;
			if(c%2==0)
				even_sum+=c;
			System.out.println("The sum of the EVEN Numbers are "+even_sum);
	}
}
