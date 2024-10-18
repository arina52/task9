public class Main {
    public static void main(String[] args) {
        Person somePerson = new Person("Arina", "street 1");
        System.out.println(somePerson);
        Student someStudent = new Student("Dan", "street 2", "TI", 2023, 10000);
        System.out.println(someStudent);
        Staff someStaff = new Staff("Viorel", "street 3", "UTM", 20000);
        System.out.println(someStaff);
    }
}