package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data();
        System.out.println("2. data = " + data);
        data = null;
        System.out.println("3. data = " + data);
    }

}

/*
GC - 가비지 컬렉션, 아무도 참조하지 않는 인스턴스의 최후
data 에 null을 할당했다. 이렇게 아무도 참조하지 않게 되면
원래 참조값을 다시 구할 방법이 없고, 해당 인스턴스에 접근할 방법이 없다.
이렇게 아무도 참조하지 않는 인스턴스는 사용되지 않고, 메모리 용량만 차지할 뿐이다.

과거 프로그래밍 언어는 개발자가 직접 명령어를 사용해서 인스턴스를 메모리에서 제거해야 했다.
이걸 삭제를 누락하면 메모리에 사용되지 않는 객체가 가득해져서 메모리 부족 오류가 발생하게 된다.
자바는 이런 과정을 자동으로 처리해준다. JVM의 GC가 더이상 사용하지 않는 인스턴스라고 판단하고 자동으로 메모리에서 제거해준다.

객체는 해당 객체를 참조하는 곳이 있으면, JVM이 종료할 때 까지 계속 생존한다.
그런데 중간에 해당 객체를 참조하는 곳이 모두 사라지면, 그때 JVM은 필요없는 객체로 판단하고 GC를 사용해서 제거한다.
 */
