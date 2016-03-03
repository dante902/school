package pl.edu.agh.school.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Teacher {

	public final String name;
	public final String surname;
	public final Set<Course> courses = new HashSet<>();

	Teacher(String name, String surname) {
		this.name = Objects.requireNonNull(name);
		this.surname = Objects.requireNonNull(surname);
	}
}
