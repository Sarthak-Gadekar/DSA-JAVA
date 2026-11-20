class Animal 
{
    void sound() 
	{
        System.out.println(" Animal makes sound.");
    }
}
class Dog extends Animal 
{
    void sound() 
	{
        System.out.println("Dog barks");
    }
}
 class OverridingDemo
{
    public static void main(String[] args) 
	{
        Animal A1 = new Animal();
        Animal D1 = new Dog(); 
        A1.sound();
        D1.sound();
    }
}
