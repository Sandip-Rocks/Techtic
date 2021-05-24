
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
			if (tmp1.charAt(j) == tmp2.charAt(i)) //iterate all the characters
			{
				j++;

			}
	}
		return (j == m); //return true or false
	}

	public static void main(String[] args)throws IOException
	{
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		System.out.println("Enter Virus Name");
		String str1=in.readLine();
		System.out.println("The name of the Virus is "+str1);
		System.out.println("Enter number of people");
		int n,i,len1,len2;
		
		String str2;
		n=Integer.parseInt(in.readLine()); //input no of people
		String arr[]=new String[n]; //Declare String of array with size= no of people
		System.out.println("The total no of people is "+n);
		for(i=0;i<n;i++) {
			System.out.println("Enter the Sample report of person "+(i+1));
			str2=in.readLine();
			arr[i]=str2;
		}
		for(i=0;i<arr.length;i++) { //iterate all the strings of the array
			String temp=arr[i];
			System.out.println("Temp "+temp);
			len1=str1.length();
			len2=temp.length();
			boolean result = report(str1, temp, len1, len2); //function call to receive boolean value
			if (result)
				System.out.println("POSITIVE");
			else
				System.out.println("NEGATIVE");
		}

//		String str1 = "crns";
//        String str2 = "coronavirus";
//        int len1 = str1.length();
//        int len2 = str2.length();
//        boolean result = report(str1, str2, len1, len2);
// 
//        if (result)
//		System.out.println("POSITIVE");
//	else
//		System.out.println("NEGATIVE");
	} //End of public
} //End of class

