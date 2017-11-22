/**
 * 
 */
package org.escoladeltreball.redsocial;

import java.util.List;

import org.escoladeltreball.redsocial.Person.Sex;

/**
 * @author iaw47941842
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> roster = Person.createRoster();
		
		System.out.println("Persons odler than 20");
		RosterTest.printPersonsOlderThan(roster, 20);
		System.out.println();
		System.out.println("Persons between the ages of 14 and 30");
		RosterTest.printPersonsWithinAgeRange(roster, 14, 30);
		System.out.println();
		System.out.println("Persons with MALE gender");
		RosterTest.printPersonsDepensGender(roster, Sex.MALE);
		System.out.println();
		System.out.println("Person who are eligible for selective Service");
		class CheckPersonEligibleForSelectiveService implements CheckPerson {
			
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getGender() == Person.Sex.MALE 
						&& p.getAge() >= 18
						&& p.getAge() <= 30;				
			}
		}
		
		RosterTest.printPerson(roster, new CheckPersonEligibleForSelectiveService());
		System.out.println();		
		
		// Cuarta aproximacion
		
		System.out.println("Quarta aproximació");
		
	    RosterTest.printPerson(roster, new CheckPerson() {
	      public boolean test(Person p) {
	        return (p.getGender() == Person.Sex.MALE) && (p.getAge() >= 18 && p.getAge() <= 30);
	      }
	    });
	    
	    // Cinquena aproximació
	    System.out.println("Cinquena aproximació");
	    System.out.println("Persons who are eligible for Selective Service" + "(llamada expression):");
	    
	    RosterTest.printPerson(
	    		roster, 
	    		p -> p.getGender() == Person.Sex.MALE
	    		&& p.getAge() >= 18 
	    		&& p.getAge() <= 30
	    );
	    
	    System.out.println();
	    System.out.println("Sisena aproximació");
	    // Sissena Aproximació
	    
	    System.out.println("Persons who are eligible for Selective Service " + "(with Predicate parameter):");
	    
	    RosterTest.printPersonsWithPredicate(roster,
	    		p -> p.getGender() == Person.Sex.MALE
	    		&& p.getAge() >= 18
	    		&& p .getAge() <= 30);
	    
	    System.out.println();
	    System.out.println("Setena aproximació");
	    System.out.println("Persons who are eligible for Selective Service " + "(with Predicate parameter and consumer parameters):");
	    
	    RosterTest.processPersons(roster, 
	    	p -> p.getGender() == Person.Sex.MALE
	    		&& p.getAge() >= 18
	    		&& p .getAge() <= 30,
	    	p -> p.printPerson()
	    );
	    System.out.println();
	    
	    
	    
	}
	

}
