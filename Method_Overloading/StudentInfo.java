class StudentInfo{
    void display(String name){
        System.out.println("Name: " + name);
    }

    void display(String name, int age){
        System.out.println("Name: " + name + ", Age: " + age);
    }

    void display(String name, int age, double marks){
        System.out.println("Name: " + name + ", Age: " + age + ", Marks: " + marks); 
    }

    public static void main(String args[]){
        StudentInfo s = new StudentInfo();
        s.display("Chaitanya");
        s.display("Chaitanya", 23);
        s.display("Chaitanya", 23, 89.5);

    }
}