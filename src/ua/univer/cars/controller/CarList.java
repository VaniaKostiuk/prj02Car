package ua.univer.cars.controller;

import ua.univer.cars.model.Car;

public class CarList {
	private Car [] cars ;
	private int count ;
	
	public CarList () {
		cars = new Car[10];
		count=-1;
	}
	public void add(Car car){
		cars[++count] = car ;	
	}
	public Car get(int i){
		return cars[i];
	}
	public void set(int i , Car c) {
		cars[i]=c;
	}
	public int size(){
		return count+1;
	}
	
	public void print() {
		for (int i = 0; i < size(); i++) {
		System.out.println(cars[i]);
		}
	}
	
	public void printCarsByName (String name) {
		for (int i = 0; i < size(); i++) {
			if(cars[i].getName().equals(name)) {
				System.out.println(cars[i]);
			}
		}
	}
	public CarList getCarsByName (String name) {
	CarList CarsByName = new CarList ();
	for (int i = 0; i < size(); i++) {
			if(cars[i].getName().equals(name)) {
				System.out.println(cars[i]);
			}
		}
	return CarsByName ;
	}
	
	public CarList getCarsByModelYearN (String model,int yearOfOperation,  int thisYear ) {
		CarList CarsByModelYearN = new CarList ();
		for (int i = 0; i < size(); i++) {
				if(cars[i].getModel().equals(model) && (thisYear - cars[i].getYear())>yearOfOperation) {
					System.out.println(cars[i]);
				}
			}
		return CarsByModelYearN ;
		}
	
	public CarList getCarsByYearNPriceN (int year , int price) {
		CarList CarsByYearNPriceN = new CarList ();
		for (int i = 0; i < size(); i++) {
				if(cars[i].getYear()==year && cars[i].getPrice()>price) {
					System.out.println(cars[i]);
				}
			}
		return CarsByYearNPriceN ;
		}
	
}

