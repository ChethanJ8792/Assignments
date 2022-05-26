package com.org.capgemini.oops;
//This is the example for Polymorphism 
//Mammal->forms(Human,Cattle,Monkey)
abstract  class Mammal
{
	public abstract void eats();
}
class Human extends Mammal
{
	public void eats()
	{
		System.out.println("Food");
	}
}
class Cattle extends Mammal
{
	public void eats()
	{
		System.out.println("Feed");
	}
}
class Monkey extends Mammal
{
	public void eats()
	{
		System.out.println("Banana");
	}
	
}
public class InHeritance {

	public static void main(String[] args) {
		//Upcasting can be done only if ineritance is done
		//Same mammal but different name->PolyMorphism
		Mammal ma=new Human();//This will point Human
		ma.eats();
		Mammal ma1=new Cattle();//This will point Cattle
		ma1.eats();
		Mammal ma2=new Monkey();//This will point Monkey
		ma2.eats();
	}

}
