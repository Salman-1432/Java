//Abstration
// security provided
// Enhacement
//you can implement
//1 abstract class
//2 interface

abstract class animal
{
    animal()
    {
        System.out.println("All animals----!");
    }
    public abstract void sound();
}
class Dog extends animal
{
    Dog()
    {
        super();
    }
    public void sound()
    {
        System.out.println("Dog is Barking");
    }
}
class Lion extends animal
{
    Lion()
    {
        super();
    }
    public void sound()
    {
        System.out.println("Lion is roar");
    }
}
class Abs
{
    public static void main(String[]args)
    {
        //animal r=new Abs();
        Dog r=new Dog();r.sound();
        Lion r1=new Lion();r1.sound();
    }
}


