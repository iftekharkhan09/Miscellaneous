package com.src.string;

public class HashCodeOverridding {
	public static void main(String[] args) {
		Student s1 = new Student(23, "Iftekhar", 54);
		Student s2 = new Student(23, "Iftekhar", 54);
		System.out.println(s1.equals(s2));
	}
}

class Student {
	private int age;
	private String name;
	private int marks;

	public Student(int age, String name, int marks) {
		super();
		this.age = age;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public int hashCode() {
		int seed = 7;
		int result = 1;
		result = seed * result + name.hashCode();
		return seed * result + age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (this == null || this.getClass() != obj.getClass())
			return false;
		Student student = (Student) obj;
		return this.age == student.age && (name != null && this.name == student.name);
	}
}