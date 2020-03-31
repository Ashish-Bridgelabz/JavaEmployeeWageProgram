public class  EmployeeWage{
	private static final  int IS_PART_TIME=1;
	private static final int IS_FULL_TIME=2;
	private final int EMP_RATE_PER_HOUR;
	private final int NUM_OF_WORKING_DAY;
	private final int MAX_HRS_IN_MONTH;
	int totalEmpWage;
	//WE ARE TAKING CONSTRUCTOR PARAMETER
	public EmployeeWage(int EMP_RATE_PER_HOUR,int NUM_OF_WORKING_DAY,int MAX_HRS_IN_MONTH){
		this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
		this.NUM_OF_WORKING_DAY = NUM_OF_WORKING_DAY;
		this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
	}
 	public static void main (String args[]){
         EmployeeWage company1 = new EmployeeWage(20,20,100);
         employeeCompany(company1);
			EmployeeWage company2 = new EmployeeWage(20,20,50);
         employeeCompany(company2);
	}
	public void setEmpWage(int totalEmpWage){
 	this.totalEmpWage = totalEmpWage;
	}

	private static void employeeCompany(EmployeeWage employeeWage){ 
		//WE ARE TAKING LOCAL VARIABLE
		int empHrs=0,totalEmpHrs=0,totalWorkingDays=0,empWage=0,totalEmpWage=0;
			while (totalEmpHrs <= employeeWage.MAX_HRS_IN_MONTH && totalWorkingDays < employeeWage.NUM_OF_WORKING_DAY){
					totalWorkingDays++;
					int empCheck = (int) (Math.random()*10)%3;
				switch (empCheck){
					case IS_PART_TIME:
							empHrs=4;
							break;
					case IS_FULL_TIME:
							empHrs=8;
							break;
					default:
							empHrs=0;
				}
				totalEmpHrs += empHrs;
				empWage = empHrs * employeeWage.EMP_RATE_PER_HOUR;
				totalEmpWage += empWage;
				System.out.println("Day:" +totalWorkingDays + "Emp Hr:"+empHrs);
			}
			employeeWage.setEmpWage(totalEmpWage);
			System.out.println("Total empWage for company2:" +totalEmpWage);
	}

}


