/* This program is supposed to demonstrate how polymorphism and inheritance works. This program 
 * creates Person, Student, Undergraduate, Employee, Faculty, and Staff objects. The respective classes 
 * take in the parameters, gets the paraments, sets the parameter, and then outputs the specific 
 * properties of each object to the console!
 *  
 * 
 * Through the creation of different classes, we understand how subclasses inherit methods 
 * and variables from their superclasses, how to use dot(.) operators, the keyword super(), 
 * getters, setters, and how to compare properties of objects of the same class.
 * 
 * Paulo D. Nadal
 * 
 * Project 2 - Polymorphism | EECS 1510
 * 
 * April 20, 2023
 * 
 */
public class PolymorphismDemo
{
	public static void main(String[] args)
	{
		// makes an array of person objects
		Person[] people = new Person[22];
		// create objects
		people[0] = new Person("Smith, Ron");
		people[1] = new Person("Rory, Jake");
		people[2] = new Undergraduate();
		people[3] = new Undergraduate("Kick, Anita", 9931, 2);
		people[4] = new Employee();
		people[5] = new Staff("Harvey, Patrick", "EECS", 4555, 20);
		people[6] = new Student();
		people[7] = new Staff();
		people[8] = new Person();
		people[9] = new Undergraduate("Bugg, June", 9901, 4);
		people[10] = new Student("DeBanque, Robin", 8812);
		people[11] = new Faculty("Thomas, Lawrence", "EECS", 6221, "Associate Professor");
		people[12] = new Faculty();
		people[13] = new Student("Rumbry, Jon", 9693);
		people[14] = new Employee("Deer, Bob", "CHEM", 4201);
		people[15] = new Faculty("Hobbs, Joe", "EECS", 4531, "Associate Chair");
		people[16] = new Employee("Shmo, Joe", "MAIN", 7824);
		people[17] = new Staff("Yawf, Len", "MECH", 8942, 28);
		people[18] = new Staff("Bruh, John", "ARTE", 2369, -2);
		people[19] = new Employee("Brando, Dio", "JOJO", 8945);
		people[20] = new Faculty("Hennen, Christie", "EECS", 9821, "Advisor");
		people[21] = new Undergraduate("Tired, Iam", 4532, 6);
		
		
		// prints out all the stuff for the objects of the classes
		for (Person p : people)
		{
			p.writeOutput();
			System.out.println();
		}
	}
}