package oop1;

public class ValueData {
    int value;

    void add(){
        value++;
        System.out.println("숫자 증가 value = " + value);
    }
}

/*
static 키워드가 붙지 않는다.
메서드는 객체를 생성해야 호출할 수 있다. static이 붙으면 객체를 생성하지 않고도 메서드를 호출할 수 있다.

 */