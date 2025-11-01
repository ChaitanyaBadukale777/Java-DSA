class ClassA
{
    int num = 10;
    ClassA() {
        System.out.println("ClassA Constructor");
    }
    void display() {
        System.out.println("Display method of ClassA");
    }
}

class ClassB extends ClassA
{
    int num = 20;
    ClassB() {
        super(); // calls ClassA constructor
        System.out.println("ClassB Constructor");
    }
    void show() {
        System.out.println("ClassB num: " + this.num);     // current class variable
        System.out.println("ClassA num: " + super.num);    // parent class variable
        super.display(); // call parent method
    }
}

class ClassC extends ClassB
{
    int num = 30;
    ClassC() {
        super(); // calls ClassB constructor
        System.out.println("ClassC Constructor");
    }
    void print() {
        System.out.println("ClassC num: " + this.num);
        this.show();  // calling ClassB method using this
    }
}

public class This_and_Super_Ex
{
    public static void main(String[] args)
    {
        ClassC obj = new ClassC();
        obj.print();
    }
}
