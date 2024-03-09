package ref;

// 기본형과 참조형
/*
변수의 데이터 타입은 기본형과 참조형으로 분류할 수 있다.
기본형(primitive type) - 변수에 사용할 값을 직접 넣을 수 있는 데이터
참조형(reference type) - Student student1, int[] students 와 같이 데이터에 접근하기 위한 참조(주소)를 저장하기 위한 데이터 타입.
참조형은 객체 또는 배열에 사용된다.

기본형은 값을 바로 사용가능하지만, 참조형은 .,[] 을 통해서 찾아가야 사용가능
기본형은 연산가능하지만, 참조형은 불가 주소지에 가야 실체가 있다.

기본형을 제외한 나머지는 모두 참조형.
기본형은 소문자로 시작한다. int, long, double, boolen 모두 소문자로 시작한다. 이런 기본형은 개발자가 새로 정의 불가.
개발자는 참조형인 클래스만 직접 정의가능
그리고 클래스는 대문자로 시작한다. 클래스는 모두 참조형

String - 자바에서 String은 특별하다. 사실은 클래스이고 참조형이다.
그런데 기본형처럼 문자 값을 대입가능. 문자는 매우 자주 다르므로 자바에서 편의 기능을 제공하는것


기본형과 참조형 2
대원칙 - 자바는 항상 변수의 값을 복사해서 대입힌다.
기본형이면 변수의 값을 복사해서 대입. 참조형이면 변수에 둘어있는 참조값을 복사해서 대입

Data dataB = dataA 라고 했을때 변수에 들어있는 값을 복사해서 사용한다.
그 값이 참조값이다. 그래서 dataA,dataB는 같은 참조값을 가지게 되고.
두 변수는 같은 객체 인스턴스를 참조하게 된다.

기본형과 참조형 3
대원칙 - 자바는 항상 변수의 값을 복사해서 대입한다.
메서드 호출도 마찬가지다. 메서드 호출할때 사용하는 매개변수,파라미터도 결국 변수일 뿐이다.
메서드를 호출할때 매개변수에 값을 전달하는 것도 앞서 설명한 내용과 같이 값을 복사해서 전달한다.


 */
public class VarChange1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //a 변경
        a = 20;
        System.out.println("a 변경 a = 20");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //b 변경
        b = 30;
        System.out.println("a 변경 b = 30");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

