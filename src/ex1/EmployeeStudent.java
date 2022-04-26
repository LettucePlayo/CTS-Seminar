package ex1;

public class EmployeeStudent {
	int salaryPerHour;
	//int salary; OBS: salary is dependent on salaryPerHour and hours, so it makes no sense to have a variable specific for it
	int hours;

	//public void reportHours(int addHours) {
	public void reportHours(int hoursWorked) {
		//hours+=addHours;
		hours+=hoursWorked;
		//salary=salaryPerHour*hours;
		
	}
	
	public int calculateSalary() {
		return salaryPerHour*hours;
	}
	
	//public int findMaxInsideUnsortedArray(int [] v) throws Exception {
	public int findMinInsideUnsortedArray(int [] v) throws Exception {
		if(v==null || v.length==0 ) {
			throw new Exception("Vector is null");
		}
		int min=v[0];
		///OBS: try not to have multiple fors in the same funtion
		/*for(int i=1;i<v.length-1;i=i+2) {
			if(min>v[i]) {
				min=v[i];
			}
		}
		for(int i=2;i<v.length;i=i+2) {
			if(min>v[i]) {
				min=v[i];
			}
		} */
		
		for(int i=0;i<v.length;i++) {
			if(min>v[i]) {
				min=v[i];
			}
		}
				
		return min;
	}
	
	public String getExam(int numberExam) throws Exception {
		String exams[]= {"OOP Exam","Java Exam", "Data structure Exam","C# Exam","Statistics Exam"};
	    if(numberExam>=exams.length)
	    	throw new Exception("exam must be in range 1 to 5");
	    else
	    	return exams[numberExam]; 
	    //OBS: sometimes its better to use a Data Structure based on what you need (in this case, a vector is more useful bcuz the array is rarely modified but read often
		
	    /*switch (numberExam) {
	        case 1:
	            return "OOP Exam";
	        case 2:
	            return "Java Exam";
	        case 3:
	            return "Data structure Exam";
	        case 4:
	            return "C# Exam";
	        case 5:
	            return "Statistics Exam";
	        
	        default:
	            throw new Exception("exam must be in range 1 to 5"); 
	    }*/
	}


}
