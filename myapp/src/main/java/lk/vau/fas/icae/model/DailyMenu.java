package lk.vau.fas.icae.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.*;

public class DailyMenu {
public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Canteen getCanteen() {
		return canteen;
	}

	public void setCanteen(Canteen canteen) {
		this.canteen = canteen;
	}

	public List<FoodItem> getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(List<FoodItem> foodItems) {
		this.foodItems = foodItems;
	}

@Id
private String id;
private Date date;

@ManyToOne
@JoinColumn(name="canteen_id")
private Canteen canteen;

@ManyToMany
@JoinTable(
    name = "menu_food_item",
    joinColumns = @JoinColumn(name = "menu_id"),
    inverseJoinColumns = @JoinColumn(name = "food_item_id")
)
private List<FoodItem> foodItems;
}
