package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1,"학생1",15,90);
        /*student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;
        만들고나서 대입하는걸 깔끔하게 처리가능
        */

        Student student2 = new Student();
        initStudent(student2,"학생2",16,80);


        printStudent(student1);
        printStudent(student2);
    }

    static void printStudent(Student student){
        System.out.println("이름 : " + student.name + " 나이 : " + student.age + " 성적 : " + student.grade);
    //출력할때 참조값을 넘기면 된다.
    }

    static void initStudent(Student student,String name,int age, int grade){
        student.name = name;
        student.age = age;
        student.grade = grade;
    // 참조형은 메서드를 호출할때 참조값을 전달한다.
    // 메서드 내부에서 전달된 참조값을 통해 객체의 값을 변경하거나 읽어서 사용가능
    }

}
