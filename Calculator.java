import java.util.*;
class Calculator
{
public static void main(String arg[])
{

int no1,no2,choice;
Scanner sc=new Scanner(System.in);

System.out.println("1.Additon(+)" + "\n" + "2.Substraction(-)" + "\n" + "3.Multiplication(*)" + "\n" +"4.Division(/)");

System.out.println("Enter  Your Choice");
choice=sc.nextInt();


System.out.println("Enter the first numeber");
no1=sc.nextInt();

System.out.println("Enter the second number");
no2=sc.nextInt();

switch(choice)
{
		case 1:System.out.println("Additon="+(no1+no2));
		break;
		
		case 2:
		System.out.println("Substraction="+(no2-no1));
		break;
		
		case 3:
		System.out.println("Multiplication="+(no1*no2));
		break;
		
		
		case 4:
		System.out.println("Division="+(no2/no1));
		break;
		
		default:System.out.println("Invalid choice");

}
}
}