package in.ineron.comp;

public class Powofthree {

	
	static boolean check(int n)
	{
		
		if (n <= 0)
			return false;
		
		return 1162261467 % n == 0;
	}

	// Driver code
	public static void main(String args[])
	{
		int n = 9;
		if (check(n))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}

