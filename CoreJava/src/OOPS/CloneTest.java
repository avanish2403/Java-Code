package OOPS;

class Accessory implements Cloneable{
	int c = 30;

	@Override
	protected Accessory clone() throws CloneNotSupportedException {
		
		return (Accessory) super.clone();
	}	
}

class Car extends Accessory implements Cloneable{
	int a = 10;
	int b = 20;
	Accessory accessory;

	@Override
	protected Car clone() throws CloneNotSupportedException {
		Car car = (Car) super.clone();
		car.accessory = car.accessory.clone();
		return car;
	}
	
	
}

public class CloneTest  {

	public static void main(String[] args) {
		
		Car z = new Car();
		System.out.println(z.a);
		System.out.println(z.b);
		System.out.println(z.c);

	}

}