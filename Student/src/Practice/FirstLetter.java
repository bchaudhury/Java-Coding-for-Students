package Practice;

import java.util.Scanner;

public class FirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String"+ "\n");
		String str = sc.nextLine();

		boolean abc = false;
		char ch;

		int l = str.length();
		System.out.println(l);
		
		for (int i=0; i<l-1 ; i++)
		{
			if (i==0)
			{
				ch = str.charAt(i);
				System.out.print(ch + ", ");
			}
			
			if (i>0) 
			{
				ch = str.charAt(i);
				abc = Character.isWhitespace(ch);
				if (abc == true)
				{
					ch = str.charAt(i+1);
					System.out.print(Character.toUpperCase(ch) + ", ");
					abc = false;
				}

			} 
			
		}
		
		sc.close();
	}

}
