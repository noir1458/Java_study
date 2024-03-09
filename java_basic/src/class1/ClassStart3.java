package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        //메모리에 학생을 만들어서 쓸수있게 되고
        //변수를 통해서 학생을 사용할수 있게 된다
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름 : " + student1.name + " 나이 : " + student1.age + " 성적 : " + student1.grade);
        System.out.println("이름 : " + student2.name + " 나이 : " + student2.age + " 성적 : " + student2.grade);
        System.out.println(student1);
    }

}
// 타입은 데이터의 종류나 형태를 나타낸다
// 학생이라는 타입을 만들면 되지 않을까?

// 클래스는 설계도
// 객체, 인스턴스 - 설계도 기반으로 메모리에 만들어진 실체

// java는 new student() 로 객체를 생성하면
// 메모리 어딘가에 있는 이 객체에 접근할수 있는 참조값 주소를 반환한다.
// student = x001; (참조값)
// Student student1 변수는 메모리에 존재하는 실제 student 객체의 참조값을 가지고 있다
// student1 변수를 통해 메모리에 있는 실제 객체에 접근하고 사용할 수 있다.

// 참조값을 변수에 보관해야 하는 이유는
// new Student() 코드 자체에는 아무 이름이 없다. 이 코드는 단순히 클래스를 기반으로 메모리에 실제 객체를 만드는 것이다
// 생성한 객체에 접근할 수 있는 방법이 필요하다. 그래서 객체를 생성할떄 반환되는 참조값을 어딘가에 보관해 두어야 한다.
// Student student1 변수에 참조값을 가지고 있다.


// 객체에 값 대입
// 객체의 멤버 변수에 접근하려면 먼저 객체에 접근해야 한다.
// 객체에 접근하려면 점 dot. 키워드를 이용하면 된다. 이 키워드는 변수에 들어있는 참조값을 읽어 메모리에 존재하는 객체에 접근한다.


// 클래스 - 겍체를 생성하기 위한 틀, 설계도
// 객체, 오브젝트 - 클래스에서 정의한 속성과 기능을 가진 실체, 객체는 서로 독립적인 상태를 가진다 (학생1과 학생2 객체는 같은 클래스에서 만들어졌지만 서로 다른 객체)
// 인스턴스 - 특정 클래스로부터 생성된 객체를 의미. 어떤 클래스에 속해있는지 강조할때 사용. (student1 객체는 Student 클래스의 인스턴스다)
// 인스턴스는 좀더 관계에 초점을 맞춘 용어

