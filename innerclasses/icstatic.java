package Innerclass;

class One {
    String name;
    public void first(){
        System.out.println("classs one first ");
        
    }

     static class two{
        public void second(){
            System.out.println("classs two Second ");

        }
    }
}

public class icstatic {
    public static void main(String[] args) {

        One obj = new One();
        obj.first();
        
       One.two obj1 = new One.two();
       obj1.second();
    }
    
}
