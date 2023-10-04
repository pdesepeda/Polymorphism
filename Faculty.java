
// The Faculty class is a subclass of the Employee class which also extends the Person class. The faculty 
// class creates a faculty member with a String name, String employeeDepartment, Int employeeID, and a String
// memberTitle. All four of these parameters are then printed to the console.

public class Faculty extends Employee // the Faculty class extends both the Employee and the Person class
{
    protected String memberTitle; // creates the memberTitle variable
    
    public Faculty() // default no-arg constructor
    {
    		super(); // retrives the variables and assignments from the superclasses
    		memberTitle = ""; // initializes memberTitle to zero
    }
    public Faculty(String newName, String newEmployeeDepartment, int newEmployeeID, String memberTitle) // constructor that takes in a String, String, Int, and String parameters
    {
    	this.name = newName; // makes this instance's name the newName parameter
   		this.employeeID = newEmployeeID; // makes the instance's employeeID the newEmployeeID parameter
   		this.employeeDepartment = newEmployeeDepartment; // makes the instance's employeeDepartment the newEmployeeDepartment parameter
    	this.memberTitle = memberTitle; // makes the instance's memberTitle the memberTitle parameter
    }
    public void reset(String newName, int newEmployeeID, String memberTitle) // resets the instance variables
    {
    	this.name = newName;
		this.employeeID = newEmployeeID;
		this.memberTitle = memberTitle;
    }
    public String getMemberTitle() // gets the memberTitle
    {
    	return memberTitle; // returns the memberTitle
    }
    public void setMemberTitle(String memberTitle) // sets the memberTitle
    {
    	this.memberTitle = memberTitle; // makes this instance's memberTitle the memberTitle parameter
    }
    public void writeOutput() // writes the output
    {			
    	super.writeOutput(); // retrieves the writeOutput methods from the Person and the Employee class	    	System.out.println("Title: " + this.memberTitle); // prints out "Title: " and the instance's memberTitle parameter
    	System.out.println("Title: " + this.memberTitle);
    }
    public boolean equals(Faculty otherFaculty) // checks if the qualities of this specific instance of Faculty are equal to another Faculty instance 
    {
    	return (this.name == otherFaculty.name) && (this.employeeDepartment == otherFaculty.employeeDepartment) && (this.memberTitle == otherFaculty.memberTitle) && (this.employeeID == otherFaculty.employeeID);
    }
}
