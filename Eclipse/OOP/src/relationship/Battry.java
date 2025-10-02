package relationship;

public class Battry {

	String name;
	double price;
	int mah;
	String type;
	
	public Battry(){
		
	}
	
	Battry(String name,double price,int mah,String type)
	{
		this.name = name ;
		this.price = price ;
		this.mah = mah ;
		this.type = type ;
	}
	
	public void displayBattry()
	{
		System.out.println(name);
		System.out.println(price);
		System.out.println(mah);
		System.out.println(type);
	}
}
