package Interface;

interface Draw{
    void draw();
}

class Rectangle implements Draw{
    public void draw(){System.out.println("drawing rectangle");}  
}

class Circle implements Draw{
    public void draw(){System.out.println("drawing circle");}  
}

public class interfacedemo {
    public static void main(String[] args) {
        Draw obj = new Circle();
        obj.draw();
    }
    
}
