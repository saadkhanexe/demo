package copyConstructor;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car("Audi", "V8");
		System.out.println(c1.brand+" "+c1.engine);
		Car c2=new Car(c1);
		System.out.println(c2.brand+" "+c2.engine);
		
		c2.brand="BMW"; c2.engine="v6";
		System.out.println(c2.brand+" "+c2.engine);
		
		Car c3=new Car(c1,c2);
		System.out.println(c3.brand+" "+c3.engine);
		
	}

}
