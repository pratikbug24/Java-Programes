class  narrowing5
{
	public static void main(String[] args) 
	{
		char c = 'a';
		System.out.println(c);
		
		short s = (short) c;
		System.out.println(s);
		
		byte b= (byte) c;
		System.out.println(b);
		
	}
}
