public class Person {
    int age = 0;
    String firstName = "";
    String lastName;

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
