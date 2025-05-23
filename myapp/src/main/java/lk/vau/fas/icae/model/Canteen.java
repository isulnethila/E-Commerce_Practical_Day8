package lk.vau.fas.icae.model;

import java.util.List;

import jakarta.persistence.*;

public class Canteen {
	 
	@Id
	private String id;
	private String location;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<DailyMenu> getDailyMenus() {
		return dailyMenus;
	}

	public void setDailyMenus(List<DailyMenu> dailyMenus) {
		this.dailyMenus = dailyMenus;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@OneToMany(mappedBy="canteen")
    private List<DailyMenu> dailyMenus;
    
    @ManyToMany(mappedBy="canteens")
    private List<Employee> employees;
	
	

}
