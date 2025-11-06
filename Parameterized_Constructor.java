class Student{
    private String name;
    private int age;

    Student(int age, String name){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("Name : " + name +"\n" + "Age : " + age);
        System.out.println("------------");
    }
}

public class Parameterized_Constructor {
    public static void main(String[] args) {
        Student s1 = new Student(0, "Unknown");
        Student s2 = new Student(21, "Milen");
        s1.display();
        s2.display();
    }
}
