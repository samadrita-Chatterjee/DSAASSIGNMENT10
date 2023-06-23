package in.ineron.comp;


import java.util.*;

public class CalculateLenghofString{

	
	private static int recLen(String str)
	{

		// if we reach at the end of the string
		if (str.equals(""))
			return 0;
		else
			return recLen(str.substring(1)) + 1;
	}

	
	public static void main(String[] args)
	{

		
		String str ="ILoveBangalore";
		System.out.println(recLen(str));
	}
}
