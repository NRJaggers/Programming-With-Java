//Nathan Jaggers
//1547609
//COMSC 255-3666 - Java

package Assignment5;

import java.util.Scanner;

public class Assignment5 {
	
	public static void main(String[] args) {
		//declarations
		Course compsc = new Course("Comsc-255", "Laura Lo") ;
		Scanner input = new Scanner(System.in) ;
		String studentName, testName ;
		
		//welcome
		System.out.println("Welcome to the Program!\n"
				+ "=============================================") ;
		
		//create a course with default capacity,adds twenty students
		for (int i = 0 ; i < 20 ; i++)
		{
			//input test
//			System.out.print("Please enter the name of the student you would like to add : ");
//			studentName = input.next() ;
//			compsc.addStudent(studentName);
			
			//generic test
			testName = "student" + i ;
			compsc.addStudent(testName);
		}
		
		//display current results
		compsc.print();
		
		//removes three students and remove nonexisting student
			
			//input test
//			for (int i = 0 ; i < 3 ; i++)
//			{
//				System.out.print("Please enter the name of the student you would like to drop : ");
//				studentName = input.next() ;
//				compsc.dropStudent(studentName);
//			}
//			
//			System.out.print("Please enter the name of the that doesn't exsit : ");
//			studentName = input.next() ;
//			compsc.dropStudent(studentName);
//		
			//generic test
			compsc.dropStudent("student.3");
			compsc.dropStudent("student3");
			compsc.dropStudent("student.7");
			compsc.dropStudent("student5");
			compsc.dropStudent("student13");
			compsc.dropStudent("student-10");
			
		//adds two students 
		compsc.addStudent("Naji Amro");
		compsc.addStudent("Maria Winder");
			
		//then displays the course info
		compsc.print();
		
		//Call clear() 
		compsc.clear();
		
		//display the course info again.
		compsc.print();
		
		//goodbye
		System.out.println("Goodbye and have a wonderful day\n") ;
		
	}
	
}

