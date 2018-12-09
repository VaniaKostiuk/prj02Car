package prj02Car;

public class ProgramCar {

	public static void main(String[] args) {
		
		CarList carList = new CarList () ;
		carList.add(new Car (1,"vaz","2101",1980,"blue",1500,7777));
		carList.add(new Car (2,"gaz","3310",1990,"green",2000,6666));
		carList.add(new Car (3,"daf","f450",2010,"red",10000,5555));
		carList.add(new Car (4,"vaz","2102",1988,"bl",100,444));
		carList.add(new Car (5,"vaz","2103",1985,"ue",500,7555));
		
		CarList carsVaz = carList.getCarsByName("vaz");
		carsVaz.print();
		System.out.println("**********************");
		
		CarList carsVaz20 = carList.getCarsByModelYearN("2103", 20, 2018);
		carsVaz20.print();
		System.out.println("***********************");
		
		CarList carsVaz1980p1000 = carList.getCarsByYearNPriceN(1980, 1000);
		carsVaz1980p1000.print();
	}

}
