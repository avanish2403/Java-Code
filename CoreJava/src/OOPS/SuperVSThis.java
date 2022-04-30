package OOPS;


abstract class A1 {
	int x;
	A1(){
		x = 100;
		System.out.println("A1 default constructor");
	}
	A1(int x){
		this();
		this.x = x;
		System.out.println("A1 param constructor");
	}
	void print() {
		System.out.println("Parent print function");
	}
}

class A2 extends A1{
	int x;
	int y;
	A2(){
		super(200);
		x = 300;
		y = 400;
		System.out.println("A2 default constructor");
	}
	A2(int x){
		this();
		this.x = x;
		System.out.println("A2 param constructor");
	}
	@Override
	void print() {
		System.out.println("Child print function");
	}
	int getx() {
		return super.x;
	}
}

class A3 extends A2{
	int x;
	A3(){
		super(500);
		x = 200;
		System.out.println("A3 default constructor");
	}
	A3(int x){
		this();
		this.x = x;
		System.out.println("A3 param constructor");
		System.out.println("local x = " + x + " " + "this x = " + this.x + " " + "parent x = " + super.x + " " + "grandparent x = " + super.getx() + " " + "parent y = " + " " + y );
	}
	@Override
	void print() {
		System.out.println("Grandchild print function");
	}
}

public class SuperVSThis {

	public static void main(String[] args) {
		A3 a3 = new A3(600);
		a3.print();
	}

}