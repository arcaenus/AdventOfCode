
public class Day2 
{
	public int part1(int[][] ar)
	{
		int checksum = 0;
		int min;
		int max;
		for(int i = 0; i < ar.length; i++)
		{
			min = ar[i][0];
			max = ar[i][1];
			for(int j = 1; j < ar[i].length; j++)
			{
				if(min > max)
				{
					int temp = max;
					max = min;
					min = temp;
				}
				if(ar[i][j] < min)
				{
					min = ar[i][j];
				}else if(ar[i][j] > max)
				{
					max = ar[i][j];
				}
			}
			
			checksum = checksum + (max - min);
		}
		return checksum;
	}
	
	public int part2(int[][] ar)
	{
		int result = 0;
		for(int i = 0; i < ar.length; i++)
		{
			for(int j = 0; j < ar[i].length; j++)
			{

				int x = 0;
				while(ar[i].length - 1 - x >= 0)
				{
					if(ar[i][j] != ar[i][ar[i].length-1-x])
					{
						if(ar[i][j]%ar[i][ar[i].length-1-x] == 0)
						{
							result = result + (ar[i][j]/ar[i][ar[i].length-1-x]);
							x = ar[i].length;
							j = ar[i].length;
						}
					}
					
				x++;
				}
			}
		}
		return result;
	}
}
