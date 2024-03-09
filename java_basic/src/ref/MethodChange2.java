package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전 : " + dataA.value);
        changeReference(dataA);
        System.out.println("메서드 호출 후 : " + dataA.value);
    }
    static void changeReference(Data dataX) {
        dataX.value = 20;
    }
}
/*
10
20
참조형일떄는 값이 바뀌었다.

1. 메서드 호출
매개변수인 dataX에 변수 dataA의 값을 전달(참조값)
출력해보면 알수있다
2. 메서드 안에서 값을 변경
메서드 안에서 dataX.value = 20 로 새로운 값을 대입한다
참조값을 통해 인스턴스에 접근하고 value값을 20으로 변경한다
dataX, dataA 는 모두 같은 인스턴스를 참조하기 때문에 dataX.value와 dataA.value는 둘다 20이라는 값을 가진다
3. 메서드 종료
메서드 종료 후 dataA.value 확인시 바뀐걸 확인가능


자바에서 메서드의 매개변수(파라미터)는 항상 값에 의해 전달된다.
이 값이 실제 값인지, 참조값인지에 따라 동작이 달라진다

기본형 - 메서드로 기본형 데이터를 전달하면, 해당 값이 복사되어 전달된다.
이 경우, 메서드 내부에서 매개변수 값을 변경해도, 호출자의 변수 값에는 영향이 없다.
참조형 - 메서드로 참조형 데이터를 전달하면, 참조값이 복사되어 전달된다.
이 경우, 메서드 내부에서 매개변수로 전달된 객체의 멤버 변수를 변경시, 호출자의 객체도 변경된다.


 */