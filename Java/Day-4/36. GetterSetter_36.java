class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Teacher extends Person {
    private String degree;

    public Teacher(String name, int age, String degree) {
        super(name, age);
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}

class Store {
    private String name;
    private String address;

    public Store(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

public class GetterSetter_36 {
    public static void main(String[] args) {
       
        Person person = new Person("Dharma", 30);  //Creating objects
        System.out.println(person.getName() + " " + person.getAge());

        Teacher teacher = new Teacher("Dhana", 32, "PhD");
        System.out.println(teacher.getName() + " " + teacher.getAge() + " " + teacher.getDegree());

        // Example for Store class
        Store store = new Store("KGISL Books Store", "Kaniyakumari");
        System.out.println("Store Name: " + store.getName() + ", Address: " + store.getAddress());

        // Update store information using setter methods
        store.setName("Raja Books Store,Saravanpatti");
        store.setAddress("cross cut road townhall,Coimbatore-641025");

        System.out.println("Updated Store Name: " + store.getName() + ", Updated Address: " + store.getAddress());
    }
}
