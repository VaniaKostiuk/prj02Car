package ua.univer.cars.model;

public class Car {
	
	private int id ;
	private String name ;
	private String model ;
	private int year ;
	private String color ;
	private int price ;
	private int regId ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRegId() {
		return regId;
	}
	public void setRegId(int regId) {
		this.regId = regId;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", model=" + model + ", year=" + year + ", color=" + color
				+ ", price=" + price + ", regId=" + regId + "]";
	}
	public Car(int id, String name, String model, int year, String color, int price, int regId) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
		this.regId = regId;
	}
	
	
	
}
