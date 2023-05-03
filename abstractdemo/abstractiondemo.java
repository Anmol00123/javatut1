package abstraction;

abstract class Bike{
    public abstract void brand();

    public void emptyFuel(){
        System.out.println("Fuel is empty");
    }
}

class Activa extends Bike{

    @Override
    public void brand() {
        System.out.println("Activa is here");
    }

}

class Grazia extends Bike{

    @Override
    public void brand() {
        System.out.println("Grazia is here");
    }

}


public class abstractiondemo {
    public static void main(String[] args) {
        Bike b = new Grazia();
        b.brand();
        b.emptyFuel();
    }
    
}
