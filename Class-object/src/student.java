public class student {
    String name;
    int Rollno;
    double height;

    public void behaviour(){
        System.out.println("student is good");
    }

    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Sachin ";
        s1.Rollno = 16;
        s1.height = 174 ;
        System.out.println("Name of student : " +s1.name);
        System.out.println("roll number of student : " + s1.Rollno);
        System.out.println("Height os the student  : " +s1.height);
    }

}
