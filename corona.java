


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

		}
		
	}
