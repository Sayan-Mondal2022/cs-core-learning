// 'class' ->  is a Keyword
// 'Student' -> Is a Class name
class Student{
    // Instance Variables (attributes)
    String name;
    int age;

    // Static variables (Class Variables)
    static int count = 0;

    // Instance Methods (Behavior)
    void introduce(){
        System.out.printf("Hi! I am %s and I am %d\n", name, age);
    }

    // Static Methods (Class Methods)
    static void study(){
        System.out.print("Student is Studying...");
    }
}

class Teacher{
    String name;
    int age;

    // This is a Constructor, a special method used to initialize an Object
    // There are different types of Constructors.

    // 1. Default Constructor, this constructor gets created automatically when the Object is created.
    // This assigns a default value to the instance variables.

    // 2. Non-parameterized Constructor
    Teacher(){
        // this() -> is used for constructor chaining. Must be the first line inside a constructor
        this("Unknown", 0);
        System.out.println("Non-parameterized Constructor was called");
    }

    // 3. Parameterized Constructor
    Teacher(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor was called");
    }

    // 4. Copy Constructor, used to perform Deep Copy
    // Should be implemented manually
    Teacher(Teacher obj){
        this.name = obj.name;
        this.age = obj.age;
        System.out.println("Copy Constructor was called");
    }
}

public class ClassesBasics{
    public static void main(String [] args){
        Student s1 = new Student();     // Object Creation

        // The new object created will get stored in Heap Memory
        // The local variables and methods, gets stored in Stack Memory
        // Static Methods, and variables gets stored in Method Space.

        // Initializing the instance variables.
        s1.name = "Sayan";
        s1.age = 21;

        s1.introduce();

        // Using Non-Parameterized constructor
        Teacher t1 = new Teacher();
        System.out.println("Teacher name is: " + t1.name);

        // Using Parameterized constructor
        Teacher t2 = new Teacher("Luffy", 20);
        System.out.println("Teacher name is: " + t2.name);

        // Using Copy constructor, In order to make a Deep Copy
        Teacher t3 = new Teacher(t2);
        System.out.println("Teacher name is: " + t3.name);
    }
}