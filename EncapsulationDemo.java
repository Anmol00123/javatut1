class Student{
    private String name;
    private int id;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void display(){
        System.out.println(name + " " + id);
    }
}





public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Harsh");
        s1.setId(4);

        // s1.display();
        System.out.println(s1.getName());
    }
    
}
