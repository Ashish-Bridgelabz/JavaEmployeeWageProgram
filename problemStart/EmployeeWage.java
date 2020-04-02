import java.util.*;

//USING INTERFACE CLASS//
interface MultipleCompanies	{

	public void totalEmpWageMath( EmpWageBuilder emp );
}

public class  EmployeeWage implements MultipleCompanies{
	public static final  int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static int EMP_RATE_PER_HOUR;
	public static int NUM_OF_WORKING_DAYS;
	public static int MAX_HRS_IN_MONTH;

	public void totalEmpWageMath( EmpWageBuilder company ){
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		while( totalEmpHrs <= company.getMaxHrsInMonth() && totalWorkingDays < company.getNumOfWorkingDays() )  {
			totalWorkingDays++;
			int empCheck = (int) ( Math.random() * 10 ) % 3;
			switch (empCheck) {
				case IS_PART_TIME:
						empHrs = 4;
						break;
				case IS_FULL_TIME:
						empHrs = 8;
						break;
				default:
						empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " +  empHrs);
		}
		company.setTotalEmpWage( totalEmpHrs * company.getEmpRatePerHour() );
		System.out.println( "Employee is " + company.getTotalEmpWage());	
	}
	//MAIN METHOD//
	public static void main(String[] args){
		EmployeeWage empwage = new EmployeeWage();
		//DECLARE ARRAYLIST
		ArrayList<EmpWageBuilder> company = new ArrayList<EmpWageBuilder>();

		company.add( new EmpWageBuilder( 20,25,80 ));
		empwage.totalEmpWageMath( company.get(0));

		company.add( new EmpWageBuilder( 30,20,100 ));
   	empwage.totalEmpWageMath( company.get(1));
	}
}

class EmpWageBuilder{

	public static int EMP_RATE_PER_HOUR;
	public static int NUM_OF_WORKING_DAYS;
	public static int MAX_HRS_IN_MONTH;	
	int totalEmpWage;	
	
	public EmpWageBuilder( int EMP_RATE_PER_HOUR,int NUM_OF_WORKING_DAYS,int MAX_HRS_IN_MONTH ){
			this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
			this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
			this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
	}
	//USING SETTER AND GETTER METHOD
	public int getEmpRatePerHour()	{
		return EMP_RATE_PER_HOUR;
	}

	public int getNumOfWorkingDays()	{
		return NUM_OF_WORKING_DAYS;
	}

	public int getMaxHrsInMonth()	{
		return MAX_HRS_IN_MONTH;
	}

	public void setTotalEmpWage( int totalEmpWage )	{
		this.totalEmpWage = totalEmpWage;
	}

	public int getTotalEmpWage()  {
	return totalEmpWage;
	}
}

