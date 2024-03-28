import java.util.*;
class Array_sum
{
public static void main(String arg[])
{
	int[][] arr = new int[3][3];
	int sum=0;
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array element");
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	
{
	arr[i][j]=sc.nextInt();
}
}

for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	
{
	sum=sum+arr[i][j];
}
}
 
 System.out.println("Sum of all elements = " +sum);
}
}