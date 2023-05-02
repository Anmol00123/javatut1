class P1{
    public void show(){
        System.out.println("calling show method in p1");
    }
}
class P2 extends P1{
    public void show(){
        System.out.println("calling show method in p2");
    }
}





public class PolymorphismDemo {
    public static void main(String[] args) {
        P1 p = new P2();
        p.show();

        // final int a =30;
        // a += 2; // will show an error cause a cannot be changed because of the final keyword.

        
    }
    
}
