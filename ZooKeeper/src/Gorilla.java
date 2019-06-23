package src;

public class Gorilla extends Mammal{
    public void throwSomething()
    {
        energy -= 10;
        System.out.println("The gorilla throws a rock.");
        returnEnergy();
    }
    public void eatBananas()
    {
        energy += 25;
        System.out.println("The gorilla eats a banana.");
        returnEnergy();
    }
    public void climb()
    {
        energy -= 20;
        System.out.println("The gorilla climbs to higher ground.");
        returnEnergy();
    }
}
