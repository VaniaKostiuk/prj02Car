package prj02Car;

public class ProgramCar {

	public static void main(String[] args) {
		
		CarList carList = new CarList () ;
		carList.add(new Car (1,"vaz","2101",1980,"blue",1000,7777));
		carList.add(new Car (2,"gaz","3310",1990,"green",2000,6666));
		carList.add(new Car (3,"daf","f450",2010,"red",10000,5555));
		
		CarList carsVaz = carList.printCarsByName("vaz");
		carsVaz
	}

}
