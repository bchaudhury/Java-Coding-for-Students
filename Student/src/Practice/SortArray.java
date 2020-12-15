package Practice;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {15, 6 , 3, 28, 10, 5, 25, 16};
		int j = array.length;
		int k;
		int count = 0;
		
		do 
		{
		for (int i=0; i<j-1; i++)
		{
			if (array[i] >= array[i+1])
					{
						k = array[i];
						array[i] = array[i+1];
						array[i+1] = k;
					}	
		}
		count++;
		
		} while (count < j);
			
		for (int n=0; n<j; n++)
		{
			if (n==0)
			   System.out.println(array[n]);
			else if (n==j-1)
			   System.out.println(array[n]);
		}
		
		array = null;
		j = 0;
		k = 0;
		count = 0;
			
	}

}
