package ua.univer.cars.util;

import ua.univer.cars.controller.CarList;
import ua.univer.cars.model.Car;

public class Cars {
	public static void SortByYears (CarList cars) {
		for (int i = 0; i < cars.size(); i++) {
			for (int j = 0; j < cars.size()-1-i; j++) {
				if(cars.get(i).getYear()>cars.get(j).getYear()) {
					Car t = cars.get(j) ;
					cars.set(j, cars.get(j+1));
					cars.set(j+1, t);
				}
			}
			
		}
	}
	public static void SortByModel (CarList cars) {
		for (int i = 0; i < cars.size(); i++) {
			for (int j = 0; j < cars.size()-1-i; j++) {
				if(cars.get(j).getModel().compareTo(cars.get(j+1).getModel())>0) {
					Car t = cars.get(j) ;
					cars.set(j, cars.get(j+1));
					cars.set(j+1, t);
				}
			}
			
		}
	}
}
