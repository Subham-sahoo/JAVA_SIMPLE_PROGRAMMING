package Inheritance;
public class Onlineshoping 
{
	int i =9;
	void Onlineshop()
	{
		System.out.println("Display in onlineshop");
	}
	}
class Amazon extends Onlineshoping
{
	void Amazon()
	{
		System.out.println("Buy all Mobile appliance");
	}
	}
class pactto extends Onlineshoping
{
	void pactto()
	{
		System.out.println("buy all medicin");
	}
}