package com.inherit;
import jakarta.persistence.*;
@Entity
@DiscriminatorValue(value="RegEmployee")
class RegEmployee extends Employee {
	float salary;
	String dept;
	public RegEmployee(String dept,float salary,String name) {
		super(name);
		this.salary=salary;
		this.dept=dept;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
