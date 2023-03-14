public class App {
    public static void main(String[] args) {
        Person o1;
        o1 = new Person(42, "Otto", "Dampf");
        Person o2 = new Person();
        var o3 = new Person();
        o1.sayName();
        System.out.println(o1.age);
        System.out.println(o1.myAge());
        o1.location("Graz");
    }
}
