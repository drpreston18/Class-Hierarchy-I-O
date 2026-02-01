
public class Person 
{

	// Instance variables, note: Person has a Name.
	private final Name nameInfo;
	private final char gender;
	private int age;
	private String streetAddress;
	private String city;
	private String state;
	private String ZIP;
	private String phoneNumber;
	
	// Default constructor.
	public Person()
	{
		
		nameInfo      = new Name();
		gender        = 'Z';
		age           = -1;
		streetAddress = "none";
		city          = "none";
		state         = "none";
		ZIP           = "-1";
		phoneNumber   = "-1";
		
	}
	
	// Parameterized constructor.
	public Person( Name passedName, int Age, char Gender, String Address, String City, String State, String zip, String Number )
	{
		
		nameInfo      = passedName;
		age           = Age;
		gender        = Gender;
		streetAddress = Address;
		city          = City;
		state         = State;
		ZIP           = zip;
		phoneNumber   = Number;
		this.toPhoneNumberForm( phoneNumber );
		
	}
	
	// Beginning of set methods.
	public void setState( String newState )
	{
		
		state = newState;
		
	}
	
	public void setAge( int newAge )
	{
		
		age = newAge;
		
	}
	
	public void setAddress( String newAddress )
	{
		
		streetAddress = newAddress;
		
	}
	
	public void setCity( String newCity )
	{
		
		city = newCity;
		
	}
	
	public void setZIP( String newZIP )
	{
		
		ZIP = newZIP;
		
	}
	
	public void setPhoneNumber( String newPhoneNumber )
	{
		
		phoneNumber = newPhoneNumber;
		
	}
	// End of set methods.
	
	// Beginning of get methods.
	public String getState()
	{
		
		return state;
		
	}
	
	public String getName()
	{
		
		return nameInfo.toString();
		
	}
	
	public int getAge()
	{
		
		return age;
		
	}
	
	public char getGender()
	{
		
		return gender;
		
	}
	
	public String getAddress()
	{
		
		return streetAddress;
		
	}
	
	public String getCity()
	{
		
		return city;
		
	}
	
	public String getZIP()
	{
		
		return ZIP;
		
	}
	
	public String getPhoneNumber()
	{
		
		return phoneNumber;
		
	}
	// End of get methods.

    // toString method returns name, age, gender, address, city, ZIP, & phone number as a singular string.	
	public String toString()
	{
		
		String age         = String.valueOf( this.age         );
		String gender      = String.valueOf( this.gender      );
		return nameInfo.toString() + " " + age + " " + gender + " "
				+ streetAddress + " " + city + " " + ZIP + phoneNumber;
		
	}
	
	// Method compares two Person objects using compare, compareTo functions & boolean logic.  
	// Returns 1 if first object is greater than second object.
	// Returns 0 if objects are the same.
	// returns -1 if second object is greater than first object.
	// Note: no longer determined by just a singular comparison, but the sum of three comparisons.
	public int compareTo( Person otherPerson )
	{
		
		int firstCompare;
		int secondCompare;
		int thirdCompare;
		
		if( this.nameInfo.toString().compareTo( otherPerson.getName() ) == -1 )
		{
			
			firstCompare = -1;
			
		}
		else if( this.nameInfo.toString().compareTo( otherPerson.getName() ) == 0 )
		{
			
			firstCompare = 0;
			
		}
		else
		{
			
			firstCompare = 1;
			
		}
		
		if( age == otherPerson.getAge() )
		{
			
			secondCompare = 0;
			
		}
		else if( age > otherPerson.getAge() )
		{
			
			secondCompare = 1;
			
		}
		else 
		{
			
			secondCompare = -1;
			
		}
		
		if( Character.compare( gender, otherPerson.getGender() ) == 0 )
		{
			
			thirdCompare = 0;
			
		}
		else if( gender == 'F' && otherPerson.getGender() == 'M' )
		{
			
			thirdCompare = 1;
			
		}
		else
		{
			
			thirdCompare = -1;
			
		}
		
		int compareSum = firstCompare + secondCompare + thirdCompare;
		if( compareSum > 0 )
		{
			
			return 1;
			
		}
		else if( compareSum < 0 )
		{
			
			return -1;
			
		}
		else
		{
			
			return 0;
			
		}
		
	}
	
	// Method checks if two Person objects are the same using equals function & boolean logic.
	// Note: dependent on six comparisons instead of just one.
	public boolean equals( Person otherPerson )
	{
		
		boolean compareOne   = false;
		boolean compareTwo   = false;
		boolean compareThree = false;
		boolean compareFour  = false;
		boolean compareFive  = false;
		boolean compareSix   = false;
		
		if( nameInfo.toString().equals( otherPerson.getName().toString() ) )
		{
			
			compareOne   = true;
			
		}
		if( age == otherPerson.getAge() )
		{
			
			compareTwo   = true;
			
		}
		if( gender == otherPerson.getGender() )
		{
			
			compareThree = true;
			
		}
		if( streetAddress.equals( otherPerson.getAddress() ) )
		{
			
			compareFour  = true;
			
		}
		if( city.equals( otherPerson.getCity() ) )
		{
			
			compareFive  = true;
			
		}
		if( ZIP == otherPerson.getZIP() )
		{
			
			compareSix   = true;
			
		}
		
		if( compareOne && compareTwo && compareThree && compareFour &&
			compareFive && compareSix )
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
