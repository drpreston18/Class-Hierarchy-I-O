// Note: Student class is a subclass of Person class.
public class Student extends Person
{

	// Instance variables, note: Student is a Person.
	private final Person studentPerson;
	private final String studentID;
	private String universityName;
	private int enrolledCredits;
	private String inStateRateQualification;
	private String lateFeeAssessed;
	private char foodOptionPlan;
	private String healthOptionChoice;
	
	// Default constructor.
	public Student()
	{
		
		studentPerson = new Student();
		studentID = "0000000000";
		universityName = "none";
		enrolledCredits = 0;
		inStateRateQualification = "Unknown";
		lateFeeAssessed = "Unknown";
		foodOptionPlan = 'D';
		healthOptionChoice = "Unknown";
		
	}
	
	// Parameterized consructor.
	public Student( Person person, String ID, String UniName, int Credits, String InterestQualification, String LateFee, 
		            char FoodPlan, String healthOption )
	{
		
		studentPerson             = person;
		studentID                 = ID;
		universityName            = UniName;
		enrolledCredits           = Credits;
		inStateRateQualification = InterestQualification;
		lateFeeAssessed           = LateFee;
		foodOptionPlan            = FoodPlan;
		healthOptionChoice        = healthOption;
		
	}
	
	// Beginning of set methods.
	public void setUniversityName( String newName )
	{
		
		universityName = newName;
		
	}
	
	public void setEnrolledCredits( int NumOfCredits )
	{
		
		enrolledCredits = NumOfCredits;
		
	}
	
	public void setInStateQualification( String answer )
	{
		
		if( answer.equals( "y" ) || answer.equals( "Y" ) )
		{
			
			inStateRateQualification = answer;
			
		}
		else if( answer.equals( "n" ) || answer.equals( "N" ) )
		{
			
			inStateRateQualification = answer;
			
		}
		
	}
	
	public void setLateFeeAssessed( String answer )
	{
		
		if( answer.equals( "yes" ) || answer.equals( "Yes" ) )
		{
			
			lateFeeAssessed = answer;
			
		}
		else if( answer.equals( "no" ) || answer.equals( "No" ) )
		{
			
			lateFeeAssessed = answer;
			
		}
		
	}
	
	public void setFoodPlan( char choice )
	{
		
		if( choice == 'A' || choice == 'B' || choice == 'C' )
		{
			
			foodOptionPlan = choice;
			
		}
		else
		{
			
			foodOptionPlan = 'D';
			
		}
		
	}
	
	public void setHealthchoice( String answer )
	{
		
		if( answer.equals( "y" ) || answer.equals( "Y" ) )
		{
			
			healthOptionChoice = answer;
			
		}
		else if( answer.equals( "n" ) || answer.equals( "N" ) )
		{
			
			healthOptionChoice = answer;
			
		}
		
	}
	// End of set methods.

	// Beginning of get methods.	
	public String getStudentID()
	{
		
		return studentID;
		
	}
	
	public String getUniversityName()
	{
		
		return universityName;
		
	}
	
	public int getEnrolledCredits()
	{
		
		return enrolledCredits;
		
	}
	
	public String getInStateQualification()
	{
		
		return inStateRateQualification;
		
	}
	
	public String getLateFeeAssessed()
	{
		
		return lateFeeAssessed;
		
	}
	
	public char getFoodPlan()
	{
		
		return foodOptionPlan;
		
	}
	
	public String getHealthPlan()
	{
		
		return healthOptionChoice;
		
	}
	
	public Person getPerson()
	{
		
		return studentPerson;
		
	}
	// End of get methods.
	
	// toString method returns ID, uni name, crdits, instate rate, late fee, food plan, health option, 
	// ZIP, phone number, address, city, state, & name as a singular string.
	public String toString()
	{
		
		String Credits  = String.valueOf( enrolledCredits );    
		String FoodPlan = String.valueOf( foodOptionPlan );
		String zip      = String.valueOf( studentPerson.getZIP() );
		String Phone    = String.valueOf( studentPerson.getPhoneNumber() );
		return studentID + " " + universityName + " " + Credits + " " +
			   inStateRateQualification + " " + lateFeeAssessed + " " +
			   FoodPlan + " " + healthOptionChoice + " " + zip  + " " +
			   Phone + " " + studentPerson.getAddress() + " " + 
			   studentPerson.getCity() + " " + studentPerson.getState()
			   + " " + studentPerson.getName();
		
	}
	
	// Method compares two Student objects using compareTo function & boolean logic. 
	// Returns 1 if first object is greater than second object.
	// Returns 0 if objects are the same. 
	// Returns 1 if second object is greater than first object.
	// Note: dependent on sum of two compareTo functions.
	public int compareTo( Student otherStudent )
	{
		
		int compareOne;
		int compareTwo;
		
		if( studentPerson.toString().compareTo( otherStudent.getPerson().toString() ) == 1 )
		{
			
			compareOne = 1;
			
		}
		else if( studentPerson.toString().compareTo( otherStudent.getPerson().toString() ) == -1 )
		{
			
			compareOne = -1;
			
		}
		else
		{
			
			compareOne = 0;
			
		}
		
		if( studentID.compareTo( otherStudent.getStudentID() ) == 1 )
		{
			
			compareTwo = 1;
			
		}
		else if( studentID.compareTo( otherStudent.getStudentID() ) == -1 )
		{
			
			compareTwo = -1;
			
		}
		else
		{
			
			compareTwo = 0;
			
		}
		
		int sum = compareOne + compareTwo;
		if( sum > 0 )
		{
			
			return 1;
			
		}
		else if( sum < 0 )
		{
			
			return -1;
			
		}
		else
		{
			return 0;
			
		}
		
	}
	
	// Method checks if two Student objects are the same using equals function & boolean logic.
	// Note: dependent on two comparisons. 
	public boolean equals( Student otherStudent )
	{
		
		boolean compareOne = false;
		boolean compareTwo = false;
		Person otherPerson = otherStudent.getPerson();
		
		if( studentPerson.getName().equals( otherPerson.getName() ) )
		{
			
			compareOne = true;
			
		}
		if( studentID.equals( otherStudent.getStudentID() ) )
		{
			
			compareTwo = true;
			
		}
		
		if( compareOne && compareTwo )
		{
			
			return true;
			
		}
		else
		{
			
			return false;
			
		}
		
	}
	
}
