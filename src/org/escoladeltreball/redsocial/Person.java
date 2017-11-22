/**
 * 
 */
package org.escoladeltreball.redsocial;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;

/**
 * @author iaw47941842
 *
 */
public class Person {
	
	public enum Sex {
		MALE,FEMALE
	}
	
	private String name;
	private LocalDate birthday;
	private Sex gender;
	private String emailAddress;
	
	/**
	 * @param name
	 * @param birthday
	 * @param gender
	 * @param emailAddress
	 */
	public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.emailAddress = emailAddress;
	}
	
	public int getAge() {
		return birthday.until(IsoChronology.INSTANCE.dateNow()).getYears();
	}
	
	public void printPerson() {
		System.out.println(name + ", " + this.getAge());
	}
	
	public static int compareByAge(Person a, Person b) {
		return a.birthday.compareTo(b.birthday);
	}
	
	public static List<Person> createRoster() {
		
		List<Person> roster = new ArrayList<>();
		roster.add(
				new Person(
				"Fred",
				IsoChronology.INSTANCE.date(1980, 6, 20),
				Person.Sex.MALE,
				"fred@example.com"));
		roster.add(
				new Person(
				"Jane",
				IsoChronology.INSTANCE.date(1990, 7, 15),
				Person.Sex.FEMALE,
				"jane@example.com"));
		roster.add(
				new Person(
				"George",
				IsoChronology.INSTANCE.date(1991, 8, 13),
				Person.Sex.MALE,
				"george@example.com"));
		roster.add(
				new Person(
				"Bob",
				IsoChronology.INSTANCE.date(2000, 9, 12),
				Person.Sex.MALE,
				"bob@example.com"));				
						
		return roster;		
				
	}
	
	// **************** Getters & Setters ****************

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the birthday
	 */
	public LocalDate getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return the gender
	 */
	public Sex getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(Sex gender) {
		this.gender = gender;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
