
// The person class takes in a String parameter, String name, and creates a person with 
// a specific name and outputs it to the console

public class Person
{ 
   protected String name; // creating the name variable

   public Person() // default no-arg constructor for Person
   {	
	   name = ""; // makes the name empty
   }
   public Person(String initialName) // constructor that takes a name parameter
   {
	   name = initialName; // makes this instance's name the parameter
   }
   public String getName() // get the name
   {
	   return name; // returns the name
   }
   public void setName(String name) // set the name
   {
	   this.name = name; // makes this instance's name the name parameter
   }
   public void writeOutput() // writes the output
   {
	   System.out.println("Name: " + this.name);  // prints out "Name: " and the instance "name"
   }
   public boolean hasSameName(Person otherPerson) // checks if this instance of person has the same name as another person
   {
	   if (this.name == otherPerson.name) // checks if this instance's name matches otherPerson name
	   {
		   return true; // if it's true, then it returns true
	   }
	   return false; // if not, then it returns false
   }
   
}
