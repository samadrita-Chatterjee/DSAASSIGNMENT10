package in.ineron.comp;



class GeneratePowerSet  {

	
	static void powerSet(String str, int index, String curr)

	{
		int n = str.length();

		
		if (index == n) {
			System.out.println(curr);
			return;
		}

		
		powerSet(str, index + 1, curr + str.charAt(index));
		powerSet(str, index + 1, curr);
	}

	// Driver code
	public static void main(String[] args)
	{
		String str = "abc";
		int index = 0;
		String curr = "";
		powerSet(str, index, curr);
	}
}
