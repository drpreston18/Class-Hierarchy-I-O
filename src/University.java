
public class University 
{

	// Instance variables.
	private String universityName;
	private String streetAddress;
	private String city;
	private String state;
	private String ZIP;
	private String phoneNumber;
	private double inStateTuition12Credits;
	private double inStateTuition18Credits;
	private double inStateTuitionMaxCredits;
	private double outStateTuition12Credits;
	private double outStateTuition18Credits;
	private double outStateTuitionMaxCredits;
	private double lateFees;
	private double incidentFeeRate;
	private double incidentFeeMax;
	private double healthCare12Credits;
	private double healthCare18Credits;
	private double healthCareMaxCredits;
	private double mealPlanA;
	private double mealPlanB;
	private double mealPlanC;
	
	// Default constructor.
	public University()
	{
		
		universityName            = "none";
		streetAddress             = "none";
		city                      = "none";
		state                     = "none";
		ZIP                       = "00000";
		phoneNumber               = "0000000000";
		inStateTuition12Credits   = 0.0;
		inStateTuition18Credits   = 0.0;
		inStateTuitionMaxCredits  = 0.0;
		outStateTuition12Credits  = 0.0;
		outStateTuition18Credits  = 0.0;
		outStateTuitionMaxCredits = 0.0;
		lateFees                  = 0.0;
		incidentFeeRate           = 0.0;
		incidentFeeMax            = 0.0;
		mealPlanA                 = 0.0;
		mealPlanB                 = 0.0;
		mealPlanC                 = 0.0;
		healthCare12Credits       = 0.0;
		healthCare18Credits       = 0.0;
		healthCareMaxCredits      = 0.0;
		
	}
	
	// Parameterized constructor.
	public University( String name, String address, String city, String state, String ZIP, String number, double InState12Credits,
			           double InState18Credits, double InStateMaxCredits, double OutState12Credits, double OutState18Credits,
			           double OutStateMaxCredits, double lateFee, double incidentFee, double MaxIncidentFee, double MealPlanA,
			           double MealPlanB, double MealPlanC, double healthCare12Credits, double healthCare18Credits, 
			           double healthCareMaxCredits )
	{
		
		universityName            = name;
		streetAddress             = address;
		this.city                 = city;
		this.state                = state;
		this.ZIP                  = ZIP;
		phoneNumber               = number;
		this.toPhoneNumberForm( phoneNumber );
		inStateTuition12Credits   = InState12Credits;
		inStateTuition18Credits   = InState18Credits;
		inStateTuitionMaxCredits  = InStateMaxCredits;
		outStateTuition12Credits  = OutState12Credits;
		outStateTuition18Credits  = OutState18Credits;
		outStateTuitionMaxCredits = OutStateMaxCredits;
		lateFees                  = lateFee;
		incidentFeeRate            = incidentFee;
		incidentFeeMax            = MaxIncidentFee;
		mealPlanA                 = MealPlanA;
		mealPlanB                 = MealPlanB;
		mealPlanC                 = MealPlanC;
		this.healthCare12Credits  = healthCare12Credits;
		this.healthCare18Credits  = healthCare18Credits;
		this.healthCareMaxCredits = healthCareMaxCredits;
		
	}
	
	// Beginning of set methods.
	public void setUniversityName( String name )
	{
		
		universityName = name;
		
	}
	
	public void setAddress( String Address )
	{
		
		streetAddress = Address;
		
	}
	
	public void setCity( String newCity )
	{
		
		city = newCity;
		
	}
	
	public void setState( String newState )
	{
		
		state = newState;
		
	}
	
	public void setZIP( String newZIP )
	{
		
		ZIP = newZIP;
		
	}
	
	public void setPhoneNumber( String Number )
	{
		
		phoneNumber = Number;
		
	}
	
	public void setInStateTuition12Credits( double Tuition )
	{
		
		inStateTuition12Credits = Tuition;
		
	}
	
	public void setInStateTuition18Credits( double Tuition )
	{
		
		inStateTuition18Credits = Tuition;
		
	}
	
	public void setInStateTuituionMaxCredits( double Tuition )
	{
		
		inStateTuitionMaxCredits = Tuition;
		
	}
	
	public void setOutStateTuition12Credits( double Tuition )
	{
		
		outStateTuition12Credits = Tuition;
		
	}
	
	public void setOutStateTuition18Credits( double Tuition )
	{
		
		outStateTuition18Credits = Tuition;
		
	}
	
	public void setOutStateTuitionMaxCredits( double Tuition )
	{
		
		outStateTuitionMaxCredits = Tuition;
		
	}
	
	public void setLateFee( double Fee )
	{
		
		lateFees = Fee;
		
	}
	
	// Note: if incidentFeeRate exceeds incidentFeeMax, incidentFeeRate is set of incidentFeeMax.
	public void setIncidentFeeRate( double Fee )
	{
		
		incidentFeeRate = Fee;
		if( incidentFeeRate > incidentFeeMax && incidentFeeMax != 0 )
		{
			
			incidentFeeRate = incidentFeeMax;
			
		}
		
	}
	
	public void setIncidentFeeMax( double Fee )
	{
		
		incidentFeeMax = Fee;
		
	}
	
	public void setMealPlan( char Plan, double Price )
	{
		
		if( Plan == 'A' )
		{
			
			mealPlanA = Price;
			
		}
		else if( Plan == 'B' )
		{
			
			mealPlanB = Price;
			
		}
		else if( Plan == 'C' )
		{
			
			mealPlanC = Price;
			
		}
		
	}
	// End of set methods.

	// Beginning of get methods.
	public String getUniversityName()
	{
		
		return universityName;
		
	}
	
	public String getAddress()
	{
		
		return streetAddress;
		
	}
	
	public String getCity()
	{
		
		return city;
		
	}
	
	public String getState()
	{
		
		return state;
		
	}
	
	public String getZIP()
	{
		
		return ZIP;
		
	}
	
	public String getPhoneNumber()
	{
		
		return phoneNumber;
		
	}
	
	public double getInStateTuition12Credits()
	{
		
		return inStateTuition12Credits;
		
	}
	
	public double getInStateTuition18Credits()
	{
		
		return inStateTuition18Credits;
		
	}
	
	public double getInStateTuitionMaxCredits()
	{
		
		return inStateTuitionMaxCredits;
		
	}
	
	public double getOutStateTuition12Credits()
	{
		
		return outStateTuition12Credits;
		
	}
	
	public double getOutStateTuition18Credits()
	{
		
		
		return outStateTuition18Credits;
		
	}
	
	public double getOutStateTuitionMaxCredits()
	{
		
		return outStateTuitionMaxCredits;
		
	}
	
	public double getLateFees()
	{
		
		return lateFees;
		
	}
	
	public double getIncidentFeeRate()
	{
		
		return incidentFeeRate;
		
	}
	
	public double getIncidentFeeMax()
	{
		
		return incidentFeeMax;
		
	}
	
	public double getHealthCare12Credits()
	{
		
		return healthCare12Credits;
		
	}
	
	public double getHealthCare18credits()
	{
		
		return healthCare18Credits;
		
	}
	
	public double getHealthCareMaxCredits()
	{
		
		return healthCareMaxCredits;
		
	}
	
	public double getMealPlan( char Plan )
	{
		
		if( Plan == 'A' )
		{
			
			return mealPlanA;
			
		}
		else if( Plan == 'B' )
		{
			
			return mealPlanB;
			
		}
		else if( Plan == 'C' )
		{
			
			return mealPlanC;
			
		}
		else
		{
			
			return 0.0;
			
		}
		
	}
	// End of get methods.
	
	// toString method, which returns university name as a string.
	public String toString()
	{
		
		return universityName;
		
	}
	
	// Method that checks if two University objects are the same using equals function & boolean logic.
	// Note: depedent on five comparisons. 
	public boolean equals( University otherUni )
	{
		
		boolean pass1 = false;
		boolean pass2 = false;
		boolean pass3 = false;
		boolean pass4 = false;
		boolean pass5 = false;

		if( this.universityName.equals( otherUni.getUniversityName() ) )
		{
			
			pass1 = true;
			
		}
		if( this.streetAddress.equals( otherUni.getAddress() ) )
		{
			
			pass2 = true;
			
		}
		if( this.city.equals( otherUni.getCity() ) )
		{
			
			pass3 = true;
			
		}
		if( this.state.equals( otherUni.getState() ) )
		{
			
			pass4 = true;
			
		}
		if( this.ZIP == otherUni.getZIP() )
		{
			
			pass5 = true;
			
		}
		
		if( pass1 && pass2 && pass3 && pass4 && pass5 )
		{
			
			return true;
			
		}
		else
		{
			
			return false;
			
		}

	}
	
	// Converts a phone number into standard phone number form.
	// ex: (000)000-0000
	public void toPhoneNumberForm( String PhoneNumber )
	{
		
		String firstThree  = PhoneNumber.substring( 0, 3 );
		firstThree         = "(" + firstThree + ")";
		String middleThree = PhoneNumber.substring( 3, 6 );
		String lastFour    = PhoneNumber.substring( 6 );
		lastFour           = "-" + lastFour;
		phoneNumber        = firstThree + middleThree + lastFour;
		
		
	}
	
}
