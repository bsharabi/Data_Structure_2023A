package L01.inheritance;

import static java.lang.System.out;

abstract public class Person implements MyActions {

    private String name;
    private String lastName;
    private final String id;
    private double age;

    //-------------------Setter %% Getter---------------------------
    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public double getAge() {
        return age;
    }

    //---------------------------------------------------------------------
    //----------------------------Constructor--------------------------
    public Person(String name, String lastName, String id, double age) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
    }


    //---------------------------------------------------------------------
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}

class Student extends Person  {
    private String universityName;

    public Student(String name, String lastName, String id, double age, String universityName) {
        super(name, lastName, id, age);
        this.universityName = universityName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String eat() {
        return ("I'm eating now " + getName());
    }

    @Override
    public String drinkUp() {
        return ("I'm drinking now " + getName());
    }

    @Override
    public String practice() {
        return ("I'm practicing now " + getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "universityName='" + universityName + '\'' +
                '}' + "\n" + super.toString();
    }
}

class Employee extends Person  {

    private String workplaceName;
    public String getWorkplaceName() {
        return workplaceName;
    }

    public void setWorkplaceName(String workplaceName) {
        this.workplaceName = workplaceName;
    }

    public Employee(String name, String lastName, String id, double age, String workplaceName) {
        super(name, lastName, id, age);
        this.workplaceName = workplaceName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "workplaceName='" + workplaceName + '\'' +
                '}' + super.toString();
    }

    @Override
    public String eat() {
        return ("I'm eating now " + getName());
    }

    @Override
    public String drinkUp() {
        return ("I'm drinking now " + getName());
    }

    @Override
    public String practice() {
        return ("I'm practicing now " + getName());
    }
}

class Main_ {
    public static void main(String[] args) {

        String[] name = {"Barak", "Naor", "Bob", "Alice"};
        String[] lastName = {"Sharabi", "Novo", "Koren", "Dror"};

        Person stud = new Student(name[0], lastName[0], "123456789", 20.5, "Ariel");
        Student stud2 = new Student(name[1], lastName[1], "123456789", 21.5, "Ariel");
        Person emp = new Employee(name[2], lastName[2], "123456789", 22.5, "U_Ariel");
        Employee emp2 = new Employee(name[3], lastName[3], "123456789", 23.5, "U_Ariel");
        out.println("-------------------------------------");
        out.println(stud);
        out.println(stud2);
        out.println(stud2.eat());
        out.println("-------------------------------------");

        MyActions[] ar = {
                new Student(name[0], lastName[0], "123456789", 20.5, "Ariel"),
                new Student(name[1], lastName[1], "123456789", 21.5, "Ariel"),
                new Employee(name[2], lastName[2], "123456789", 22.5, "U_Ariel"),
                new Employee(name[3], lastName[3], "123456789", 23.5, "U_Ariel")
        };

        Person[] arPer = {
                new Student(name[0], lastName[0], "123456789", 20.5, "Ariel"),
                new Student(name[1], lastName[1], "123456789", 21.5, "Ariel"),
                new Employee(name[2], lastName[2], "123456789", 22.5, "U_Ariel"),
                new Employee(name[3], lastName[3], "123456789", 23.5, "U_Ariel")
        };
        out.println("-------------------------------------");
        out.println(ar[3]);
        out.println(ar[1]);
        out.println(ar[0].eat());
        out.println("-------------------------------------");

        out.println("-------------------------------------");
        out.println(arPer[3]);
        out.println(arPer[1]);
        out.println(arPer[0].eat());
        out.println("-------------------------------------");


    }
}

interface MyActions {

    public String eat();

    public String drinkUp();

    public String practice();
}
