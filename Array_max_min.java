import java.util.*;
class Array_max_min
{
public static void main(String arg[])
{
	int[] arr = new int[5];
	int max,min;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array element");
for(int i=0;i<5;i++)
{
	arr[i]=sc.nextInt();
}
 max=min=arr[0];
for(int i=0;i<5;i++)
{
	
	if(arr[i]>max)
	{
		max=arr[i];
		
	}
	
   else if(arr[i]<min)
	{
		min=arr[i];
	
	}
	
}
System.out.println("Max element" +max);
System.out.println("Min element" +min);
}
}