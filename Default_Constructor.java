class Constructor{
    private String name;
    private int age;

    Constructor(){
        name = "Milen";
        age = 21;
    }
    public void display(){
        System.out.println("Name : " + name +"\n" + "Age : " + age);
    }
}

public class Default_Constructor {
    public static void main(String[] args) {
        Constructor c = new Constructor();
        c.display();
    }
}
