
// The student class is a subclass of the Person class. It takes in a String name and an Int studentNumber.
// These are then outputted to the console when a instance of the Student class is made.

public class Student extends Person // the Student class is a subclass of the Person class
{
    protected int studentNumber; // creating the studentNumber variable
    
    public Student() // default no-arg constructor for Student
    {
    	super(); // retrieves the variables and assignments from the superclass
   		studentNumber = 0; // initializes studentNumber to zero
    }
    public Student(String newName, int newStudentNumber) // constructor that takes in a String and an Int parameter
    {
   		this.name = newName; // makes this instance's name the newName parameter
   		this.studentNumber = newStudentNumber; // makes this instance's studentNumber the newStudentNumber parameter
    }
    public void reset(String newName, int newStudentNumber) // resets the instance variables
    {
   		this.name = newName; 
   		this.studentNumber = newStudentNumber;
    }
    public int getStudentNumber() // gets the studentNumber
    {
   		return studentNumber; // returns the studentNumber
    }
    public void setStudentNumber(int studentNumber) // sets the studentNumber
    {
    	this.studentNumber = studentNumber; // makes this instance's studentNumber the studentNumber parameter
    }
    public void writeOutput() // writes the output to the console 
    {	
    	super.writeOutput(); // retrives the writeOutput method from the Person class
		System.out.println("Student number: " + this.studentNumber); // prints out "Student number: " and the instance's studentNumber
    }
    public boolean equals(Student otherStudent) // checks if the qualities of this specific instance of Student are equal to another Student
    {
        return (this.name == otherStudent.name) && (this.studentNumber == otherStudent.studentNumber);
    }
}