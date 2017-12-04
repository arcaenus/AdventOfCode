import java.util.Arrays;

public class Day4 
{
	public int part1(String[][] passphrase)
	{
		int valid = passphrase.length;
		for(int i = 0; i < passphrase.length; i++)
		{
			for(int j = 0; j < passphrase[i].length; j++)
			{
				int x = 0;
				while(x < passphrase[i].length)
				{
				
					if(j != x && passphrase[i][j].equals(passphrase[i][x]))
					{
						valid = valid - 1;
						j = passphrase[i].length;
						x = passphrase[i].length;
					}
					x++;
				}
			}
		}
		
		return valid;
	}

	public int part2(String[][] passphrase) 
	{
		int valid = passphrase.length;
		for(int i = 0; i < passphrase.length; i++)
		{
			for(int j = 0; j < passphrase[i].length; j++)
			{
				int x = 0;
				while(x < passphrase[i].length && x != j)
				{
					char[] pass1 = passphrase[i][j].toCharArray();
					char[] pass2 = passphrase[i][x].toCharArray();
					Arrays.sort(pass1);
					Arrays.sort(pass2);
					if(Arrays.equals(pass1, pass2))
					{
						valid = valid - 1;
						x = passphrase[i].length;
						j = passphrase[i].length;
					}
					x++;
				}
			}
		}
		
		
		return valid;
	}
}
