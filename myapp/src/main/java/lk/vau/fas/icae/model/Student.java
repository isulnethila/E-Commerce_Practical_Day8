package lk.vau.fas.icae.model;

import java.util.List;

import jakarta.persistence.Entity;

import jakarta.persistence.OneToMany;

@Entity
public class Student extends person{
	
    private String academicDegree;
    
    @OneToMany(mappedBy="student")
    private List<FoodOrder> foodOrder;

	public String getAcademicDegree() {
		return academicDegree;
	}

	public void setAcademicDegree(String academicDegree) {
		this.academicDegree = academicDegree;
	}

	public List<FoodOrder> getFoodOrder() {
		return foodOrder;
	}

	public void setFoodOrder(List<FoodOrder> foodOrder) {
		this.foodOrder = foodOrder;
	}
    
    
	

}
