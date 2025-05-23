package lk.vau.fas.icae.model;

import jakarta.persistence.*;
@Entity
public class OrderLine {
	@Id
	private String id;
    private String quantity;
    
    @ManyToOne
    @JoinColumn(name = "order_id")
    private FoodOrder foodOrder;

    @ManyToOne
    @JoinColumn(name = "food_item_id")
    private FoodItem foodItem;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public FoodOrder getFoodOrder() {
		return foodOrder;
	}

	public void setFoodOrder(FoodOrder foodOrder) {
		this.foodOrder = foodOrder;
	}

	public FoodItem getFoodItem() {
		return foodItem;
	}

	public void setFoodItem(FoodItem foodItem) {
		this.foodItem = foodItem;
	}
    
	

}
