import java.util.Random;
/**
 * Calculate Daily  Employee Wage 
 * 
 * @author : pranav gupta
 *
 */
class EmployeeWage {

	static int wagePerHr = 20;
	static int fullTimeHr = 8;
	public static void main(String args[]) {

	System.out.println("Welcome !");

	Random rand = new Random();
	int isEmployee = rand.nextInt(2);	
	System.out.println(isEmployee);

	if(isEmployee == 1)
	{
		System.out.println("Employee is Present");
		System.out.println("Daily Employee Wage = " +(wagePerHr * fullTimeHr));
		
	}
	else
	{
		System.out.println("Employee is Absent");
		System.out.println("Daily Employee Wage = 0 " );
	}

	}
}
