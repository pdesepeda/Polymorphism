
// The Undergraduate class is a subclass of the Student class. The undergraduate class takes in a String name,
// Int studentNumber, and an Int level, to represent which year of school the student is in. All three of these 
// parameters are then outputted to the console.

public class Undergraduate extends Student // the Undergraduate class is a subclass of both the Student and Person class
{
  protected int level; // creating the level variable
  
  public Undergraduate() // default no-arg constructor for Undergraduate
  {
	  super(); // retrieves the variables and assignments from the superclasses
	  level = 0; // initializes level to zero
  }
  public Undergraduate(String newName, int newStudentNumber, int newLevel) // constructor that takes in a String, Int and another Int parameter
  {
	  this.name = newName; // makes this instance's name the newName parameter
	  this.studentNumber = newStudentNumber; // // makes this instance's studentNumber the newStudentNumber parameter
	  level = newLevel; // makes this instance's level the newLevel parameter
  }
  public void reset(String newName, int newStudentNumber, int newLevel) // resets the instance variables
  {
	  this.name = newName;
	  this.studentNumber = newStudentNumber;
	  this.level = newLevel;
  }
  public int getLevel() // gets the level 
  {
	  return level; // returns the level
  }
  public void setLevel(int level) // sets the level
  {
	  this.level = level; // makes this instance's level the level parameter
  }
  public void writeOutput() // writes the output
  {
	  super.writeOutput(); // retrieves the writeOutput method from the Student and Person class
	  System.out.println("Student level: " + this.level); // prints out "Student level: " and the instance's level
  }
  public boolean equals(Undergraduate otherUndergraduate) // checks if the qualities of this specific instance of Undergraduate are equal to another Undergraduate instance
  { 	
	  return (this.name == otherUndergraduate.name) && (this.studentNumber == otherUndergraduate.studentNumber) && (this.level == otherUndergraduate.level);
  }
}
