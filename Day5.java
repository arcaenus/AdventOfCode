
public class Day5 
{
	public int part1(int[] array)
	{
		int steps = 0;
		int loc = 0;
		int temp = 0;
		while(loc > -1 && loc < array.length)
		{
			temp = loc;
			loc = loc + array[temp];
			array[temp] = array[temp] + 1;
			steps++;
		}
		
		return steps;
	}

	public int part2(int[] array) 
	{
		int steps = 0;
		int loc = 0;
		int temp = 0;
		while(loc > -1 && loc < array.length)
		{
			temp = loc;
			loc = loc + array[temp];
			if(array[temp] >= 3)
				array[temp] = array[temp] - 1;
			else
				array[temp]++;
			steps++;
		}
		return steps;
	}
}
