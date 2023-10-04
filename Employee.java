
// The Employee class is a subclass of the Person class. The Employee class takes in a String name,
// Int employeeID, String employeeDepartment. All three of these parameters are then outputted to
// the console. 

public class Employee extends Person // the Employee class is a subclass of Person class
{
    protected int employeeID; // creating the employeeID variable
    protected String employeeDepartment; // creating the employeeDepartment variable
    	
    public Employee() // default no-arg constructor for Employee
   	{
    	super(); // retrieves the variables and assignments from the superclass
    	employeeID = 0; // initializes employeeID to zero;
   		employeeDepartment = ""; // initializes employeeDepartment to zero
   	}  	
   	public Employee(String newName, String newEmployeeDepartment, int newEmployeeID) // constructor that takes in a String, String, and an Int parameters
   	{    		
   		this.name = newName; // makes this instance's name the newName parameter
   		this.employeeID = newEmployeeID; // makes the instance's employeeID the newEmployeeID parameter
   		this.employeeDepartment = newEmployeeDepartment; // makes the instance's employeeDepartment the  newEmployeeDepartment parameter
    }
    public void reset(String newName, String newEmployeeDepartment, int newEmployeeID) // resets the instance variables
    {
    	this.name = newName;
   		this.employeeID = newEmployeeID;
   		this.employeeDepartment = newEmployeeDepartment;
    }   
    public int getEmployeeID() // gets the employeeID
    {
    	return employeeID; // returns the employeeID
    }
    public void setEmployeeID(int employeeID) // set the employeeID
    {
   		this.employeeID = employeeID; // makes this instance's employeeID the employeeID parameter
    }
    public String getEmployeeDepartment() // gets the employeeDepartment 
	{
		return employeeDepartment; // returns the employeeDepartment
	}
	public void setEmployeeDepartment(String employeeDepartment) // set the employeeDepartment
	{
		this.employeeDepartment = employeeDepartment; // makes this instance's employeeDepartment the employeeDepartment parameter
	}
    public void writeOutput() // writes the output
    {
   		super.writeOutput(); // retrieves the writeOutput method from the Person class
   		System.out.println("Dept: " + this.employeeDepartment); // prints out "Dept: " and the instance's employeeDepartment
   		System.out.println("Employee ID: " + this.employeeID); // prints out "Employee ID: " and the instance's employeeID
    }
    public boolean equals(Employee otherEmployee) // checks if the qualities of this specific instance of Employee are equal to another Employee instance 
    {
    	return (this.name == otherEmployee.name) && (this.employeeDepartment == otherEmployee.employeeDepartment) && (this.employeeID == otherEmployee.employeeID);
    }
    
}
