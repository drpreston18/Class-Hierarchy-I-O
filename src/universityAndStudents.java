import java.io.*;
import java.util.*;
public class universityAndStudents 
{

	
	public static void main( String[] args )
	{
		
		ArrayList<Student> Students = new ArrayList<Student>();
		ArrayList<University> Universities = new ArrayList<University>();
		FileInputStream file;
		Scanner fileReader;
		int NumOfTimes = 0;
		
		// Read from StudentFile-1.txt
		try
		{
			file = new FileInputStream( "Data\\StudentFile-1.txt" );
			fileReader = new Scanner( file );
			NumOfTimes = fileReader.nextInt();
			fileReader.nextLine();
			for( int i = 0 ; i < NumOfTimes ; i++ )
			{
				
				int distanceSoFar     		 = 0;
				String Line           		 = fileReader.nextLine();
				String firstName      		 = Line.substring( 0, Line.indexOf( ',' ) );
				distanceSoFar        		+= firstName.length() + 1;
				String middleName     		 = Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				distanceSoFar        		+= middleName.length() + 1;
				String lastName       		 = Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				distanceSoFar        		+= lastName.length() + 1;
				String placeHolder    		 = Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				distanceSoFar        		+= placeHolder.length() + 1;
				int Age               		 = Integer.valueOf( placeHolder );
				placeHolder           		 = Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				distanceSoFar        		+= placeHolder.length() + 1;
				char Gender           		 = placeHolder.charAt( 0 );
				String Address        		 = Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				distanceSoFar        		+= Address.length() + 1;
				String City           		 = Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				distanceSoFar        		+= City.length() + 1;
				String State          		 = Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				distanceSoFar        		+= State.length() + 1;
				placeHolder           		 = Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				distanceSoFar        		+= placeHolder.length() + 1;
				String ZIP                   = placeHolder;
				placeHolder                  = Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				String PhoneNumber           = placeHolder;
				distanceSoFar               += placeHolder.length() + 1; 
				String UniversityName        = Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				distanceSoFar               += UniversityName.length() + 1;
				String StudentID             = Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				distanceSoFar               += StudentID.length() + 1;
				placeHolder                  = Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				distanceSoFar               += placeHolder.length() + 1;
				int CreditsTaken             = Integer.valueOf( placeHolder );
				String InterestQualification = Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				distanceSoFar               += InterestQualification.length() + 1;
				String LateFees              = Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				distanceSoFar               += LateFees.length() + 1;
				placeHolder                  = Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				distanceSoFar               += placeHolder.length() + 1;
				char MealPlan                = placeHolder.charAt( 0 );
				String HealthCareChoice      = Line.substring( distanceSoFar );
				
				Name studentName     = new Name( firstName, middleName, lastName );
				Person studentPerson = new Person( studentName, Age, Gender, Address, City, State, ZIP, PhoneNumber );
				Student student      = new Student( studentPerson, StudentID, UniversityName, CreditsTaken, 
													InterestQualification, LateFees, MealPlan, HealthCareChoice	);
				Students.add( student );
				
			}
		}
		catch( Exception e )
		{
			System.out.println( e.getMessage() );
			System.out.println( "ArrayList size: " + Students.size() );
		}

		// Now we read from Universities9-1.txt
		try
		{
			
			file       = new FileInputStream( "Data\\Universities9-1.txt" );
			fileReader = new Scanner( file );
			NumOfTimes = fileReader.nextInt();
			fileReader.nextLine();
			for( int i = 0 ; i < NumOfTimes ; i++ )
			{
				
				int distanceSoFar 			= 0;
				String Line 				= fileReader.nextLine();
				String UniName 				= Line.substring( distanceSoFar, Line.indexOf( ',' ) );
				distanceSoFar              += UniName.length() + 1;
				String Address 				= Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				distanceSoFar 			   += Address.length() + 1;
				String City 				= Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				distanceSoFar 			   += City.length() + 1;
				String State 			    = Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				distanceSoFar              += State.length() + 1;
				String placeHolder 			= Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				distanceSoFar 			   += placeHolder.length() + 1;
				String ZIP 					= placeHolder;
				placeHolder 			    = Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				String phoneNumber          = placeHolder;
				distanceSoFar              += placeHolder.length() + 1;
				placeHolder 				= Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				distanceSoFar 			   += placeHolder.length() + 1;
				double inState12Credits     = Double.valueOf( placeHolder );
				placeHolder 				= Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				distanceSoFar 			   += placeHolder.length() + 1;
				double inState18Credits     = Double.valueOf( placeHolder );
				placeHolder 				= Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				distanceSoFar 			   += placeHolder.length() + 1;
				double inStateMaxCredits    = Double.valueOf( placeHolder );
				placeHolder 				= Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				distanceSoFar 			   += placeHolder.length() + 1;
				double outState12Credits    = Double.valueOf( placeHolder );
				placeHolder 				= Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				distanceSoFar 			   += placeHolder.length() + 1;
				double outState18Credits    = Double.valueOf( placeHolder );
				placeHolder					= Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				distanceSoFar 			   += placeHolder.length() + 1;
				double outStateMaxCredits   = Double.valueOf( placeHolder );
				placeHolder 				= Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				distanceSoFar 			   += placeHolder.length() + 1;
				double mealPlanAPrice 		= Double.valueOf( placeHolder );
				placeHolder 				= Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				distanceSoFar 			   += placeHolder.length() + 1;
				double mealPlanBPrice       = Double.valueOf( placeHolder );
				placeHolder 				= Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				distanceSoFar 			   += placeHolder.length() + 1;
				double mealPlanCPrice       = Double.valueOf( placeHolder );
				placeHolder 				= Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				distanceSoFar 			   += placeHolder.length() + 1;
				double healthCare12Credits  = Double.valueOf( placeHolder );
				placeHolder 			    = Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				distanceSoFar 			   += placeHolder.length() + 1;
				double healthCare18Credits  = Double.valueOf( placeHolder );
				placeHolder 				= Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				distanceSoFar 			   += placeHolder.length() + 1;
				double healthCareMaxCredits = Double.valueOf( placeHolder );
				placeHolder                 = Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				distanceSoFar              += placeHolder.length() + 1;
				double incidentFeeRate      = Double.valueOf( placeHolder );
				placeHolder                 = Line.substring( distanceSoFar, Line.indexOf( ',', distanceSoFar ) );
				distanceSoFar 			   += placeHolder.length() + 1;
				double lateFee 			    = Double.valueOf( placeHolder );
				placeHolder 				= Line.substring( distanceSoFar );
				distanceSoFar 			   += placeHolder.length() + 1;
				double maxIncidentFee 		= Double.valueOf( placeHolder );
				
				
				University inputUniversity  = new University( UniName, Address, City, State, ZIP, phoneNumber,
															 inState12Credits, inState18Credits, inStateMaxCredits,
															 outState12Credits, outState18Credits, outStateMaxCredits,
															 lateFee, incidentFeeRate, maxIncidentFee, mealPlanAPrice,
															 mealPlanBPrice, mealPlanCPrice, healthCare12Credits, 
															 healthCare18Credits, healthCareMaxCredits);
				Universities.add( inputUniversity );
				
			}
			
		}
		catch( Exception e )
		{
			
			System.out.println( "Error Encountered!" + e.getMessage() );
			
		}
		
		// Output Section.
		
		try
		{
			
			FileOutputStream fileOutput = new FileOutputStream( "UniversitiesAndStudentsOutput.txt" );
			PrintWriter outWritter      = new PrintWriter( fileOutput );
			University UniHolder;
			Student StudentHolder;
			
			boolean healthChoice = false;
			double Tuition       = 0.00;
			double LateFees      = 0.00;
			double IncidentFees  = 0.00;
			double HealthCare    = 0.00;
			double MealPlan      = 0.00;
			double Total         = 0.00;
			
			for( int i = 0 ; i < 10 ; i++ )
			{
				
				int j = 0;
				UniHolder = Universities.get( i );
				outWritter.println( "\t\t\t\t" + UniHolder.getUniversityName().toUpperCase() );
				outWritter.println( "\t\t\t\t" + UniHolder.getAddress() );
				outWritter.println( "\t\t\t\t" + UniHolder.getCity() + ", " + UniHolder.getState() + " " + UniHolder.getZIP() );
				outWritter.println( "\t\t\t\t" + UniHolder.getPhoneNumber() + "\n" );
				
				for( j = 0 ; j < 100 ; j++ )
				{
					
					StudentHolder = Students.get( j );
					
					if( StudentHolder.getUniversityName().compareTo( UniHolder.getUniversityName() ) == 0 )
					{
						
						// Variable Calculation Section. 
						if( StudentHolder.getInStateQualification().equals( "Y" ) )
						{
							
							if( StudentHolder.getEnrolledCredits() <= 12 )
							{
								
								Tuition = StudentHolder.getEnrolledCredits() * UniHolder.getInStateTuition12Credits();
								
							}
							else if( StudentHolder.getEnrolledCredits() <= 18 )
							{
								
								Tuition = StudentHolder.getEnrolledCredits() * UniHolder.getInStateTuition18Credits();
								
							}
							else
							{
								
								Tuition = StudentHolder.getEnrolledCredits() * UniHolder.getInStateTuition18Credits();
								
							}
							
						}
						else
						{
							
							if( StudentHolder.getEnrolledCredits() <= 12 )
							{
								
								Tuition = StudentHolder.getEnrolledCredits() * UniHolder.getOutStateTuition12Credits();
								
							}
							else if( StudentHolder.getEnrolledCredits() <= 18 )
							{
								
								Tuition = StudentHolder.getEnrolledCredits() * UniHolder.getOutStateTuition18Credits();
								
							}
							else
							{
								
								Tuition = StudentHolder.getEnrolledCredits() * UniHolder.getOutStateTuition18Credits();
								
							}
							
						}
						
						if( StudentHolder.getLateFeeAssessed().equals( "N" ) )
						{
							
							LateFees = ( Tuition * .10 );
							
						}
						
						if( StudentHolder.getHealthPlan().compareTo( "Y" ) == 0 )
						{
							
							healthChoice = true;
							
						}
							
						
						if( healthChoice && StudentHolder.getEnrolledCredits() <= 12 )
						{
							
							HealthCare = UniHolder.getHealthCare12Credits();
							
						}
						else if( healthChoice && StudentHolder.getEnrolledCredits() <= 18 )
						{
							
							HealthCare = UniHolder.getHealthCare18credits();
							
						}
						else if( healthChoice && StudentHolder.getEnrolledCredits() > 18 )
						{
							
							HealthCare = UniHolder.getHealthCareMaxCredits();
							
						}
						
						if( StudentHolder.getFoodPlan() == 'A' || StudentHolder.getFoodPlan() == 'B' ||
							StudentHolder.getFoodPlan() == 'C'	)
						{
							
							MealPlan = UniHolder.getMealPlan( StudentHolder.getFoodPlan() );
							
						}
						
						IncidentFees = Math.min( ( StudentHolder.getEnrolledCredits() * UniHolder.getIncidentFeeRate() )  , 
												UniHolder.getIncidentFeeMax() );
						
						Total = Tuition + LateFees + HealthCare + MealPlan + IncidentFees;
						
						outWritter.print( "NAME\t\t" + StudentHolder.getPerson().getName() );
						outWritter.println( "\t\tCREDITS\t\t" + StudentHolder.getEnrolledCredits() );
						outWritter.println( "ADDRESS\t\t" + StudentHolder.getPerson().getAddress() + 
											", " + StudentHolder.getPerson().getCity() + ", " + 
											StudentHolder.getPerson().getState() + " " + 
											StudentHolder.getPerson().getZIP() );
						outWritter.println( "PHONE\t\t" + StudentHolder.getPerson().getPhoneNumber() );
						outWritter.printf( "Tuition\t\t$%.2f" , Tuition );
						outWritter.printf( "\nLATE FEE\t$%.2f " , LateFees );
						outWritter.printf( "\nINCIDENTIAL\t$%.2f " , IncidentFees );
						outWritter.printf( "\nHEALTH CARE\t$%.2f " , HealthCare );
						outWritter.printf( "\nMEAL PLAN\t$%.2f" , MealPlan );
						outWritter.printf( "\t\t\tTOTAL\t\t$%.2f" , Total );
						outWritter.println( "\n" );
	
					}
					
				}
			}
			
			outWritter.close();
			
		}
		catch( Exception e )
		{
			
			System.out.println( "ERROR ENCOUNTER!" );
			System.out.println( e.getMessage() );
			
		}
		
	}
	
}
