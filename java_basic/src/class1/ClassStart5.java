package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        //메모리에 학생을 만들어서 쓸수있게 되고
        //변수를 통해서 학생을 사용할수 있게 된 다
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[]{student1, student2};
        //Student[] students = {student1, student2};
        //생성과 선언을 동시에 하는 경우 더 최적화 가능

        for (int i=0 ; i < students.length; i++){
            System.out.println("이름 : " + students[i].name + " 나이 : " + students[i].age + " 성적 : " + students[i].grade);
        }

        for (int i=0 ; i < students.length; i++){
            Student s = students[i];
            //이렇게 담아두고 쓸수 있다.
            System.out.println("이름 : " + s.name + " 나이 : " + s.age + " 성적 : " + s.grade);
        }

        for (Student s : students){
            //향상된 for문
            // iter tab(단축키)
            System.out.println("이름 : " + s.name + " 나이 : " + s.age + " 성적 : " + s.grade);
        }

    }

}

// 배열을 사용하면 특정 타입을 연속한 데이터 구조로 묶어서 관리할수 있다
// Student 클래스를 사용한 변수들도 Student 타입이기 때문에 배열을 사용해서 하나의 데이터 구조로 만들 수 있다.

// Student[] students = new Student[2];
// Student 변수를 2개 보관할 수 있는 사이즈 2의 배열을 만든다
// Student 타입의 변수는 Student 인스턴스의 참조값을 보관한다.
// 배열에는 아직 참조값을 대입하지 않았기 때문에 참조값이 없다는 의미의 null로 초기화된다

// 그 다음 배열에 객체를 보관
//students[0] = student1;
//students[1] = student2;
// java에서 대입은 항상 변수에 들어있는 값을 복사한다.(중요)
// student1,2 객체에 들어있는 참조값을 읽고 복사하여 배열에 대입
// 변수에는 인스턴스 자체가 들어있는게 아니고, 참조값이 들어있다. 인스턴스가 복사되는게 아니고 참조값만 복사된다

// 배열에 들어있는 객체를 사용하려면, 먼저 배열에 접근하고, 그 다음 객체에 접근하면 된다.
