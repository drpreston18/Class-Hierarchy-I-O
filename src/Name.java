
public class Name 
{

	// Instance variables.
	private final String firstName;
	private final String middleName;
	private final String lastName;
	
	// Default constructor.
	public Name()
	{
		
		firstName  = "none";
		middleName = "none";
		lastName   = "none";
		
	}
	
	// Parameterized constructor.
	public Name( String first, String middle, String last )
	{
		
		firstName = first;
		middleName = middle;
		lastName = last;
		
	}
	
	// Beginning of get methods.
	public String getFirstName()
	{
		
		return firstName;
		
	}
	
	public String getMiddleName()
	{
		
		
		return middleName;
		
	}
	
	public String getLastName()
	{
		
		
		return lastName;
		
	}
	// End of get methods.
	
	// Method checks if two Name objects are the same using equals function. 
	public boolean equals( Name otherName )
	{
		boolean checkOne   = false;
		boolean checkTwo   = false;
		boolean checkThree = false;
		
		if( this.firstName.equals( otherName.getFirstName() ) )
		{
			
			checkOne   = true;
			
		}
		if( this.middleName.equals( otherName.getMiddleName() ) )
		{
			
			checkTwo   = true;
			
		}
		if( this.lastName.equals( otherName.getLastName() ) )
		{
			
			
			checkThree = true;
			
		}
		if( checkOne && checkTwo && checkThree )
		{
			
			return true;
			
		}
		else
		{
			
			return false;
			
		}
		
	}
	
	// toString method returns full name as a singular string. 
	public String toString()
	{
		
		return ( this.firstName + " " + this.middleName + " " + this.lastName ); 
		
	}
	
	// Method compares two Name objects using compareTo function.  
	// Returns 1 if first object is greater than second object.
	// Returns 0 if objects are the same.
	// Returns -1 if second object is greater than first object.
	public int compareTo( Name otherName )
	{
		
		if( this.toString().compareTo( otherName.toString() ) == -1  )
		{
			
			return -1;
			
		}
		if( this.toString().compareTo( otherName.toString() ) == 0   )
		{
			
			return 0;
			
		}
		else
		{
			
			return 1;
			
		}
		
	}
	
}
