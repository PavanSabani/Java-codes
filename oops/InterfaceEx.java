package oops;

// abstract class can have abstract methods and concrete methods as well 
// interface will only have abstract methods 

interface ComputerBluePrint{
    void show1();
    void config1();
}
class Laptops implements ComputerBluePrint{
    @Override
    public void show1(){
        System.out.println("I am a hp Pavillion");
    }
    @Override
    public void config1(){
        System.out.println("I have 16gigs of ram 512 gb rom");
    }
}

public class InterfaceEx {
    public static void main(String[] args) {

        ComputerBluePrint c1 = new Laptops();

        c1.show1();
        c1.config1();

    }
}
