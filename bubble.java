import java.lang.*;

class bubble {
	
public static void main(String [] args) 
	{
		int len = args.length;
		if(len==0)
		{
			System.out.println("No args");
			return; 
		}
		int [] arr=new int[len];
		
		for(int j=0;j<len;j++)
		{
			
			arr[j]= Integer.parseInt(args[j]);
		}
		int n = len;
		for(int i = 0; i<n; ++i)
			for (int j = 0; j < n-i-1; j++)
				if (arr[j] > arr[j + 1])
				{
					int temp = arr[j]; arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
		
		for(int item: arr)
		{
			System.out.println("Arr" + item);
		}
	}

}