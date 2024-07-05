package com.inherit;
import jakarta.persistence.*;
@Entity
@Table(name="EMPDATA100")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="category",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int ID;
	String name;
	public Employee(String name) {
		super();
		this.name=name;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
}
