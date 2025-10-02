package relationship;

public class Mobile {
	
	String brand ;
	String name ;
	double price ;
	int ram ;
	int rom ;
	String precessor ;
	
	Battry b1 = new Battry("Exida",1500.0,5000,"Li-ion") ;

	public Mobile()
	{
		
	}
	
	Mobile(String brand,String name,double price,int ram,int rom,String precessor)
	{
		this.brand = brand;
		this.name = name;
		this.price = price ;
		this.ram = ram;
		this.rom = rom;
		this.precessor = precessor;
	}
	
	public void displayMobile()
	{
		System.out.println(brand);
		System.out.println(name);
		System.out.println(price);
		System.out.println(ram);
		System.out.println(rom);
		System.out.println(precessor);
		System.out.println("-------------------");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
