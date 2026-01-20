public class Person_Driver {
    public static void main(String[] args) {
        Person person1 = new Person("001", "John", "Doe", "Mr.", 1990);
        Person person2 = new Person("002", "Jane", "Smith", "Ms.", 1985);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println();

        System.out.println("Person 1 Formats:");
        System.out.println(person1.toCSVString());
        System.out.println(person1.toXMLString());
        System.out.println(person1.toJSONString());

        System.out.println();
        System.out.println("Person 2 Formats:");
        System.out.println(person2.toCSVString());
        System.out.println(person2.toXMLString());
        System.out.println(person2.toJSONString());
    }
}
