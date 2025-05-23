package lk.vau.fas.icae.model;

import java.util.List;

import jakarta.persistence.*;
@Entity
public class FoodItem {
	@Id
	private String id;
    private String name;
    private String price;
    private String weight;
    
    @ManyToMany(mappedBy = "foodItems")
    private List<DailyMenu> dailyMenus;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public List<DailyMenu> getDailyMenus() {
		return dailyMenus;
	}

	public void setDailyMenus(List<DailyMenu> dailyMenus) {
		this.dailyMenus = dailyMenus;
	}
    
	
	

}
