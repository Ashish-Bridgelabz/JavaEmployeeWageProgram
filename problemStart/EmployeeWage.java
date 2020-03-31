 public class  EmployeeWage{
	private static final  int IS_PART_TIME=1;
	private static final int IS_FULL_TIME=2;
   private static final int  TOTAL_COMPANIES =20;
	private static int EMP_RATE_PER_HOUR = 0;
	private static int NUM_OF_WORKING_DAY = 0;
	private static int MAX_HRS_IN_MONTH = 0;
	int totalEmpWage;

 	public static void main (String args[]){
		EmployeeWage2 employeeWage[] = new EmployeeWage2[TOTAL_COMPANIES];
		for (int index = 0; index < TOTAL_COMPANIES; index++) {
			//Generate Employee rate between 100 to 300
			EMP_RATE_PER_HOUR = (int) (100 + Math.random() * 200);

			//Generate Employee working days between 20 to 25
			NUM_OF_WORKING_DAY = (int) (20 + Math.random() * 5);

			//Generate Employee work hours between 100 to 200
			MAX_HRS_IN_MONTH = (int) (100 + Math.random() * 100);
			employeeWage[index] = new EmployeeWage2(EMP_RATE_PER_HOUR,NUM_OF_WORKING_DAY,MAX_HRS_IN_MONTH);
			employeeCompany( employeeWage[index], index);
		}
	}

	public static void employeeCompany(EmployeeWage2 employeeWage, int empNo){ 
		//WE ARE TAKING LOCAL VARIABLE
		int empHrs=0,totalEmpHrs=0,totalWorkingDays=0,empWage=0,totalEmpWage=0;
		while (totalEmpHrs <= employeeWage.getMAX_HRS_IN_MONTH() && totalWorkingDays < employeeWage.getNUM_OF_WORKING_DAY()){
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
				empWage = empHrs * employeeWage.getEMP_RATE_PER_HOUR();
				totalEmpWage += empWage;
		}
		employeeWage.setEmpWage(totalEmpWage);
		System.out.println("Monthly wages of employee:"+ (empNo + 1)+ ": " +totalEmpWage);
	}

}
class EmployeeWage2{
	private final int EMP_RATE_PER_HOUR;
	private final int NUM_OF_WORKING_DAY;
	private final int MAX_HRS_IN_MONTH;
	private  int totalEmpWage=0;

	//WE ARE TAKING CONSTRUCTOR PARAMETER
	public EmployeeWage2(int EMP_RATE_PER_HOUR,int NUM_OF_WORKING_DAY,int MAX_HRS_IN_MONTH){
		this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
		this.NUM_OF_WORKING_DAY = NUM_OF_WORKING_DAY;
		this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
	}
	public int getEMP_RATE_PER_HOUR(){
		return EMP_RATE_PER_HOUR;
	}
	public int getNUM_OF_WORKING_DAY(){
		return NUM_OF_WORKING_DAY;
	}
	public int getMAX_HRS_IN_MONTH(){
		return MAX_HRS_IN_MONTH;
	}
	public void setEmpWage(int totalEmpWage){
		this.totalEmpWage = totalEmpWage;
	}
}

