
public class Fpro {
//attributes
	String brand;
	String model;
	String colour;
	double weight;

//creating default constructor...
	Fpro(){}
	
	Fpro(String brand){
		this.brand = brand;
	}
	
	Fpro(String brand, String model, double weight){
		this.brand = brand;
		this.model = model;
		this.weight = weight;
	}
	
//methods...
	public void chopping() {
		System.out.println("Now it is chopping. It is great chopping");
	}
	
	public void blending() {
		System.out.println("Now it is blending.");
		
	}
	
	public void slicing() {
		System.out.println("Now it is slicing.");
	}
	
	public void printData() {
		System.out.println("Brand of the food processor: " + brand);
		System.out.println("Model name: " + model);
		System.out.println("Colour: " + colour);
		System.out.println("Weight: " + weight);
	}
	
	public void changeValues(String brand, String model, String colour) {
		this.brand = brand;
		this.model = model;
		this.colour = colour;
	}

	
	public static void main(String[] args) {
		Fpro obj1 = new Fpro();
		Fpro obj2 = new Fpro();
		obj1.changeValues("tina", "majiv", "white");
		obj1.printData();
	}

}
