package lk.vau.fas.icae.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
@Entity

public class Employee extends person {
	private String jobpostion;
	public String getJobpostion() {
		return jobpostion;
	}
	public void setJobpostion(String jobpostion) {
		this.jobpostion = jobpostion;
	}
	public List<Canteen> getCanteens() {
		return canteens;
	}
	public void setCanteens(List<Canteen> canteens) {
		this.canteens = canteens;
	}
	@ManyToMany
	@JoinTable(
	name="employee_canteen",
	joinColumns=@JoinColumn(name="employee_id"),
	inverseJoinColumns=@JoinColumn(name="canteen_id"))
	private List<Canteen> canteens;
	

}
