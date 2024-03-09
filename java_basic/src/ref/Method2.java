package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1",15,90);
        System.out.println("student1 = " + student1);
        Student student2 = createStudent("학생2",16,80);
        System.out.println("student2 = " + student2);

        printStudent(student1);
        printStudent(student2);
    }

    static void printStudent(Student student){
        System.out.println("이름 : " + student.name + " 나이 : " + student.age + " 성적 : " + student.grade);
    //출력할때 참조값을 넘기면 된다.
    }

    static Student createStudent(String name,int age,int grade){
        Student student = new Student();
        //객체를 생성하는 부분도 메서드 안에 포함.
        System.out.println("student = " + student);
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
        //만들어진 참조값을 반환
    }

}


