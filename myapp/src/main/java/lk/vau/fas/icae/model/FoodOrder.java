package lk.vau.fas.icae.model;

import java.util.List;

import jakarta.persistence.*;
@Entity
public class FoodOrder {
@Id
private String id;
private String datePlaced; // Note: Typo here, should be "datePlaced"

@ManyToOne
@JoinColumn(name = "student_id")
private Student student;

@ManyToOne
@JoinColumn(name = "menu_id")
private DailyMenu dailyMenu;

@OneToMany(mappedBy = "foodOrder")
private List<OrderLine> orderLines;

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getDatePlaced() {
	return datePlaced;
}

public void setDatePlaced(String datePlaced) {
	this.datePlaced = datePlaced;
}

public Student getStudent() {
	return student;
}

public void setStudent(Student student) {
	this.student = student;
}

public DailyMenu getDailyMenu() {
	return dailyMenu;
}

public void setDailyMenu(DailyMenu dailyMenu) {
	this.dailyMenu = dailyMenu;
}

public List<OrderLine> getOrderLines() {
	return orderLines;
}

public void setOrderLines(List<OrderLine> orderLines) {
	this.orderLines = orderLines;
}


}
