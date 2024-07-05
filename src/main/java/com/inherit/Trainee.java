package com.inherit;
import jakarta.persistence.*;
@Entity
@DiscriminatorValue(value="Trainee")
public class Trainee extends Employee {
	float payperhour;
	String contractperiod;
	
	public Trainee(String contractperiod,float payperhour,String name) {
		super(name); 
			this.payperhour=payperhour;
			this.contractperiod=contractperiod;
	}
	public float getPaperhour() {
		return payperhour;
	}
	public void setPaperhour(float paperhour) {
		this.payperhour = paperhour;
	}
	public String getContractperiod() {
		return contractperiod;
	}
	public void setContractperiod(String contractperiod) {
		this.contractperiod = contractperiod;
	}
}
