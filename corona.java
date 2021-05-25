

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class corona {

	static boolean report(String tmp1, String tmp2,
								int m, int n)
	
	{
		int j = 0;
		for (int i = 0; i < n && j < m; i++)
		{
			if (tmp1.charAt(j) == tmp2.charAt(i))
			{
				j++;

			}
	}
		return (j == m);
	}

	public static void main(String[] args)throws IOException
	{
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		System.out.println("Enter Virus Name");
		String str1=in.readLine();
		str1=str1.toLowerCase(); //convert String into Lower Case
		System.out.println("The name of the Virus is "+str1);
		System.out.println("Enter number of people");
		int n,i;
		
		String str2;
		n=Integer.parseInt(in.readLine()); //input no of people
		String arr[]=new String[n]; //Declare String of array with size= no of people
		while(true) { //Infinite loop
			if(n>=1 && n<=10) { //condition to validate the whenther n is between 1 to 10
				System.out.println("The total no of people is "+n);
				
			}
			else {
				System.out.println("Enter number between 1 to 10");
				n=Integer.parseInt(in.readLine());
			}
			for(i=0;i<n;i++) {
				System.out.println("Enter the Sample report of person "+(i+1));
				str2=in.readLine();
				str2=str2.toLowerCase();//Convert String in lower case
				arr[i]=str2;
			}
			for( i=0;i<arr.length;i++) {
				String tmp1 = arr[i];
		        int length1 = tmp1.length();
		        int length2 = str1.length();
		        boolean result = report(tmp1, str1, length1, length2);
		 
		        if (result)
				System.out.println("POSITIVE");
			else
				System.out.println("NEGATIVE");
			}
			break;

		}
		
	}
}
