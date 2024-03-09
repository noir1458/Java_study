package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; //NullPointerException 예외 발생
        System.out.println("data = " + data.value);
    }
}

/*
NullPointerException - 주소가 없는 곳을 찾아갈때 발생하는 에러
Null에 dot을 찍을때 발생한다.

 */