package Student;

public class student {
    String name;
    int age;
    String father_name;

    student(String n, int a, String f){
        name = n;
        age = a;
        father_name = f;
    }

    public void display(){
        System.out.println("Student name : " +name);
        System.out.println("Age : "+age);
        System.out.println("His Father name : "+father_name);
    }

}
