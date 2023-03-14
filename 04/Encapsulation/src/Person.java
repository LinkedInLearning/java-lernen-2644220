public class Person {
    private int age = 0;
    String firstName = "";
    String lastName;
    Person(){

    }

    Person(int age, String firstName, String lastName){
        this.age=age;
        this.firstName=firstName;
        this.lastName=lastName;

    }

    void sayName(){
        System.out.println("Mein Name ist " + firstName + " " + lastName + ".");
    }

    String myAge(){
        return "Mein Alter ist " + age + ".";
    }
    void location(String where) {
        System.out.println("Ich wohne in " + where + ".");
    }

}
