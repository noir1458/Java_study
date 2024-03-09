package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전 : a = " + a);
        changePrimitive(a);
        System.out.println("메서드 호출 후 : a = " + a);
    }

    static void changePrimitive(int x) {
        x = 20;
    }

}
/*
둘다 10이 나오게 된다.

1. int x = a 자바에서 변수의 값을 대입하는것은 항상 값을 복사해서 대입.
a,x 각각 숫자 10을 가지고 있다.
2. 메서드 안에서 값을 변경
x=20, a는 그대로
3. 메서드 종료
x는 제거된다

 */
