package jp.co.aforce.test;

import java.util.ArrayList;

class Employee {

	private String number;
	private String name;
	private String gender;
	private String age;

	public Employee(String number, String name, String gender, String age) {
		this.number = number;
		this.name = name;
		this.gender = gender;
		this.age = age;

	}

	public String getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getAge() {
		return age;
	}

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee("1", "田中太郎", "男性", "27"));
		employees.add(new Employee("2", "佐藤花子", "女性", "22"));
		employees.add(new Employee("3", "鈴木次郎", "男性", "31"));

		for (Employee employee : employees) {
			System.out.println("番号は" + employee.number + "、名前は" + employee.name + "、年齢は" + employee.age + "歳です");
		}

	}
}
