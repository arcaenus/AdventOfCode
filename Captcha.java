
public class Captcha {

	public int Part1(String input) 
	{
		int sum = 0;
		for(int i = 1; i < input.length(); i++)
		{

			if(input.charAt(i) == input.charAt(i - 1))
			{
				sum = sum + Character.getNumericValue(input.charAt(i));
			}
		}
		
		//Check circular
		if(input.charAt(input.length() - 1) == input.charAt(0))
		{
			sum = sum + Character.getNumericValue(input.charAt(0));
		}
		return sum;
	}

	public int Part2(String input)
	{
		int sum = 0;
		for(int i = 0; i < input.length()/2; i++)
		{
			int j = i + input.length()/2;
			if(input.charAt(i) == input.charAt(j))
			{
				sum = sum + Character.getNumericValue(input.charAt(i))*2;
			}
		}
		return sum;
	}

}
