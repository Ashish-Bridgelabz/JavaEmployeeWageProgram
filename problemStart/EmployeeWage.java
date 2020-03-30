public class  EmployeeWage{
	public static final  int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static int EMP_RATE_PER_HOUR;
	public static int NUM_OF_WORKING_DAY;
	public static int MAX_HRS_IN_MONTH;

	//WE ARE TAKING CONSTRUCTOR PARAMETER
	public EmployeeWage(int EMP_RATE_PER_HOUR,int NUM_OF_WORKING_DAY,int MAX_HRS_IN_MONTH){
		this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
		this.NUM_OF_WORKING_DAY = NUM_OF_WORKING_DAY;
		this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
	}

	//	WE ARE USING METHOD
	public static int	employeeCompany(){ 
		//WE ARE TAKING LOCAL VARIABLE
		int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
			while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAY){
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
				System.out.println("Day:" +totalWorkingDays + "Emp Hr:"+empHrs);
			}
			return totalEmpHrs;
	}

		public int findTotalEmpWage( int totalEmpHrs ){
				return totalEmpHrs * EMP_RATE_PER_HOUR;
		}

		public static void main (String args[]){
			EmployeeWage company1 = new EmployeeWage(20, 15, 50);
			int totalEmployeeHrs = company1.employeeCompany();
			int totalEmployeeWages	=company1.findTotalEmpWage(totalEmployeeHrs);
			System.out.println("Total employee wages of company1:" +totalEmployeeWages);

			EmployeeWage company2 = new EmployeeWage(30, 15, 60);
			int totalEmployeeHrs1 = company2.employeeCompany();
			int totalEmployeeWages1 = company2.findTotalEmpWage(totalEmployeeHrs1);
			System.out.println("Total employee Wage of company2:" +totalEmployeeWages);

		}
}


