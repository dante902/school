package pl.edu.agh.school.model;

import java.util.Objects;

public class Student {
	public final String name;
	public final String surname;

	private Group group;

	Student(String name, String surname) {
		this.name = Objects.requireNonNull(name);
		this.surname = Objects.requireNonNull(surname);
	}

	public void setGroup(Group group) {
		this.group = Objects.requireNonNull(group);
	}

	public Group getGroup() {
		return group;
	}
}
