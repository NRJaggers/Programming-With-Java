//Nathan Jaggers
//1547609
//COMSC 255-3666 - Java

package Assignment5;

public class Course {
	
//member variables
	private String courseName ;
	private String instructor ;
	private String[] studentList ;
	private int capacity ;
	private int numberOfStudents ;

//member functions
	
	//constructor
	public  Course(String name)
	    {
	        courseName = name;
	        capacity = 16 ;
	        studentList = new String[capacity] ;
	    }
	
	public  Course(String name, String instructor)
    {
        courseName = name;
        this.instructor = instructor ;
        capacity = 16 ;
        studentList = new String[capacity] ;
    }
	
	//getters
	public  String getCourseName()
	    {
	        return courseName;
	    }
	
	public String getInstructor() 
		{
			return instructor ;
		}
	
	public String[] getStudents()
	    {
	        return studentList;
	    }
	
	public int getNumberOfStudents()
	    {
	        return numberOfStudents;
	    }

	//setters
	public void setInstructor(String instructor)
		{
			this.instructor = instructor ;
		}
	
	
	//other member functions
	public void addStudent(String student)
	    {
			if ((capacity)>numberOfStudents)
			{
				studentList[numberOfStudents] = student;
		        numberOfStudents++;
			}
			else
			{
				//increase capacity of class
				capacity = capacity*2 ;
				String[] temp = new String[capacity] ;
				
				for (int i = 0 ; i < (capacity/2) ; i++)
				{
					temp[i] = studentList[i] ;
				}
				
				studentList = temp ;
				
				studentList[numberOfStudents] = student;
		        numberOfStudents++;
			}
	        
	    }
	
	public void dropStudent(String student)
	    {
			//trouble shooting
			//System.out.println(student) ;
			
	        for (int i = 0 ; i < numberOfStudents ; i++)
	        {
	        	//trouble shooting
	        	//System.out.println(this.studentList[i]) ;
	        	
	        	if(this.studentList[i].equals(student))
	        	{
	        		//trouble shooting
	        		//System.out.println("in if statement") ;
	        		
	        		for(int j = (i+1); j < numberOfStudents; i++ , j++)
	        		{
	        			this.studentList[i] = this.studentList[j] ;
	        		}
	        		numberOfStudents-- ;
	        	}
	        }
	    }
	
	public void print()
		{
			System.out.println("\nCourse Name : "        + courseName + 
							   "\nInstructor : "         + instructor + 
							   "\nNumber of students : " + numberOfStudents) ;
			System.out.println("\nStudents\n=================================================") ;
			for (int i = 0 ; i < numberOfStudents ; i++ )
			{
				System.out.print(studentList[i] + "\t");
				if((i % 4) == 3)
				{
					System.out.print("\n") ;
				}
			}
			System.out.print("\n") ;
		}
	
	public void clear() 
		{
			for (int i = 0; i < capacity ; i++)
			{
				studentList[i] = null ;
			}
			numberOfStudents = 0 ;
			capacity = 16 ;
		}
}
