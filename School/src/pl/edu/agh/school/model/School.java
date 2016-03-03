package pl.edu.agh.school.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class School {

	public final String name;
	public final Set<Teacher> teachers = new HashSet<>();
	public final Set<Group> groups = new HashSet<>();

	public School(String name) {
		this.name = Objects.requireNonNull(name);
	}

	public Teacher addTeacher(String name, String surname) {
		Teacher teacher = new Teacher(name, surname);
		teachers.add(teacher);
		return teacher;
	}
	
	public Group addGroup(String name) {
		Group group = new Group(name);
		groups.add(group);
		return group;
	}
	
	public Student addStudent(String name, String surname, Group group) {
		Student student = new Student(name, surname);
		group.students.add(student);
		student.setGroup(group);
		return student;
	}
	
	public Course addCourse(String name, Teacher teacher, Group group) {
		Course course = new Course(name, group);
		course.setTeacher(teacher);
		teacher.courses.add(course);
		group.courses.add(course);
		return course;
	}
}
