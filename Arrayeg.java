
public class Arrayeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 26, 8, 13, 19, 32 };
		for (int i = 0; i < 5; i++) { // printing array
			System.out.println(arr[i]);
		}
		int flag = 0;
		for (int i = 4; i >= 0; i--) { // printing array in reverse order
			System.out.println(arr[i]);
		}
		for (int i = 0; i < 5; i++) { // finding whether 26 is found or not

			if (arr[i] == 26) {
				flag = 1;

			}
		}
		if (flag == 1) {
			System.out.println("The number 26 is present");
		} else
			System.out.println("Not Found");
		int temp = arr[0]; // Largest number
		for (int i = 0; i < 5; i++) {

			if (temp < arr[i]) {
				temp = arr[i];
			}
		}
		System.out.println("The Largest is " + temp);
		int small = arr[0];
		for (int i = 0; i < 5; i++) { // smallest number

			if (small > arr[i]) {
				small = arr[i];
			}
		}
		System.out.println("The Smallest is " + small);
		int sum=0;
		for (int i=0;i<5;i++) // Sum of numbers
		{   sum+=arr[i];
			
		}
		System.out.println("The sum is "+sum);
		
		int evensum=0;
		for (int i=0;i<5;i++) // Sum of even numbers
			if(arr[i]%2==0)
		{   evensum+=arr[i];
			
		}
		System.out.println("The sum of Even Numbers is "+evensum);
		
		//string class
		int found=0;
		int pos=0;
		String[] name= {"Jaya","Rakshana","Guru","Ramu","Savithiri","Mahe"};
		for(int i=0;i<5;i++)
		{
			if(name[i].equals("Guru"))
			{
				 found=1;
				 pos=i;
				 break;}}
		if(found==1)
		{
		System.out.println("The name Guru is found in the position "+pos);	
	}
		int count=0;
		String arr1[]= {"White","Black","Pink","Blue","Red","Pink","Blue","Red","Pink","Red"};
		String arr2[]= {"White","Black","Pink","Blue","Red","Pink","Blue","Red","Pink","Red"};
		for (int i=0;i<10;i++)
		{
			if(arr1[i].equals("Red"))
			{
				count++;
			}
			if(arr2[i].equals("Red"))
			{
				count++;
			}
		}
		System.out.println("The count of red is "+count);
		
			
			
		}
		
		}
		
		
