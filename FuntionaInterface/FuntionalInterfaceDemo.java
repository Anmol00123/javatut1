package FunctionalInterface;

@FunctionalInterface
interface Draw{
    public void display();
}

public class FuntionalInterfaceDemo {


    public static void main(String[] args) {
        int w=10;
        Draw d= ()-> {System.out.println(w);
        
        
    };
    d.display();
}

    
}
