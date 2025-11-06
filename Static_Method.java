class Mobile {
    String name;
    static int price;
    String brand;

    public void show(){
        System.out.println(name + " : " + price + " : " + brand);
    }
    //public static void show1(){
        //System.out.println(name + " : " + price + " : " +brand);
    //}   
    // As static method is used name and brand cannot be accessed. So we create another method 
    public static void show1(Mobile obj){
        System.out.println(obj.name + " : " + price + " : " + obj.brand);
    }
}

public class Static_Method {
    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        obj1.name = "Apple";
        Mobile.price = 1700;      //As price is a static variable the price will be 1000 itself
        obj1.brand = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.name = "Samsung";
        Mobile.price = 1000;      //As price is a static variable we can use with Mobile.price 
        obj2.brand = "SmartPhone";

        obj1.show();
        obj2.show();

        //obj1.show1(); //This will not work as show1() is a static method

        Mobile.show1(obj1);
    }
}
