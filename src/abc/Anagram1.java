package abc;

import java.util.Arrays;
public class Anagram1 
	{
	public static void main(String[] args)
	{
	String x= "He Is aRAdHYA";
	String y= " is he HRADAYA";

	x = x.replace(" ", "");
	y = y.replace(" ", "");

	x = x.toLowerCase();
	y = y.toLowerCase();

	char a[]= x.toCharArray();
	char b[]=y.toCharArray();

	Arrays.sort(a);
	Arrays.sort(b);
	Boolean result = Arrays.equals(a,b);

	if(result==true)
	{
	System.out.println("Strings are anagram");
	}
	else
	{
	System.out.println("Strings are not anagram");
	}

	}

	}



