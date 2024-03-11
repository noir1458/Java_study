package oop1;

public class ValueObjectMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        valueData.add();
        valueData.add();
        valueData.add();
        System.out.println("최종 숫자 = " + valueData.value);
    }
}
/*
인스턴스의 메서드를 호출하는 방법은 멤버 변수를 사용하는 방법과 동일
dot을 찍어서 객체 접근한 다음에 원하는 메서드를 호출하면 된다.

add() 메서드를 호출하면 메서드 내부에서 value++을 호출하게 된다. 이떄 value에 접근해야 하는데,
기본으로 본인 인스턴스에 있는 멤버 변수에 접근한다. 본인 인스턴스가 x002 참조값을 사용한다면
자기 자신인 x002.value에 접근하게 된다.
그 다음 ++연산으로 value 값을 하나 증가시킨다.
 */
