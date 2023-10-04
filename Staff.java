
// The Staff class is a subclass of Employee which is also a subclass of the Person class. The Staff class
// creates instances of Staff with String name, String employeeDepartment, Int employeeID, and an Int payGrade.
// All four of these parameters are then outputted to the console.

public class Staff extends Employee // the Staff class extends the Employee and Person class
{
   protected int payGrade; // creates the payGrade variable
   
   public Staff() // default no-arg constructor
   {
	   super(); // retrives the variables and assignments from the superclasses
	   payGrade = 0; // initializes payGrade to zero
   }
   public Staff(String newName, String newEmployeeDepartment, int newEmployeeID, int newPayGrade) // constructor that takes in a String, String, Int, and an Int parameter
   {
	   this.name = newName; // makes this instance's name the newName parameter
	   this.employeeID = newEmployeeID; // makes the instance's employeeID the newEmployeeID parameter
	   this.employeeDepartment = newEmployeeDepartment; // makes the instance's employeeDepartment the newEmployeeDepartment parameter
	   setPayGrade(newPayGrade);
   }
   public void reset(String newName, String newEmployeeDepartment, int newEmployeeID, int newPayGrade) // resest the instance variables
   {
	   this.name = newName; // makes this instance's name the newName parameter
	   this.employeeID = newEmployeeID; // makes the instance's employeeID the newEmployeeID parameter
	   this.employeeDepartment = newEmployeeDepartment; // makes the instance's employeeDepartment the newEmployeeDepartment parameter
	   setPayGrade(newPayGrade);
   }
   public int getPayGrade() // gets the payGrade
   {
	   return payGrade; // returns the payGrade
   }

   public void setPayGrade(int payGrade) // sets the payGrade
   {
	   if (payGrade > 20 || payGrade < 0) // checks if the pay grade is between 0 and 20, if not then it sets payGrade to zero
	   {
		   this.payGrade = 0;
	   }
	   else 
	   {
		   this.payGrade = payGrade;
	   }
   }
   public void writeOutput() // writes the output
   {	
	   super.writeOutput(); // retrieves the writeOutput from the Person and Employee superclasses
	   System.out.println("Pay Grade: " + this.payGrade); // prints out "Pay Grade: " and the instance's payGrade
   } 
   public boolean equals(Staff otherStaff) // checks if the qualities of this specific instance of Staff are equal to another Staff instance 
   {
	   return (this.name == otherStaff.name) && (this.payGrade == otherStaff.payGrade) && (this.employeeID == otherStaff.employeeID) && (this.employeeDepartment == otherStaff.employeeDepartment);
   }
}
