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
public class RosterTest {
	
		public static void printPersonsOlderThan(List<Person> roster, int age) {
			for (Person p : roster) {
				if (p.getAge() >= age) {
					p.printPerson();
				}
			}
		}
		
		public static void printPersonsWithinAgeRange(List<Person> roster, int low, int high) {
			for (Person p : roster) {
				if (low <= p.getAge() && p.getAge() < high) {
					p.printPerson();
				}
			}
		}
		
		public static void printPersonsDepensGender(List<Person> roster, Sex gender) {
			for (Person p : roster) {
				if (p.getGender() == gender) {
					p.printPerson();
				}
			}
		}
		
		public static void printPerson(List<Person> roster, CheckPerson tester) {
			for (Person p : roster) {
				if (tester.test(p)) {
					p.printPerson();
				}
			}
		}

}

