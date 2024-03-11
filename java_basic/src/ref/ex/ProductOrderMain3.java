package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요 : ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] Orders = new ProductOrder[n];
        for (int i=0 ; i < Orders.length ; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");

            System.out.println("상품명 : ");
            String productName = scanner.nextLine();

            System.out.println("가격 : ");
            int price = scanner.nextInt();

            System.out.println("수량 : ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            Orders[i] = createOrder(productName,price,quantity);
        }

        printOrders(Orders);
        System.out.println(getTotalAmount(Orders));
        //ctrl + alt + v 단축키로 int total~~ = 부분을 쉽게 만들수 있다.
    }

    static ProductOrder createOrder(String productName, int price,int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + " 가격 : " + order.price + " 수량 : " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int total = 0;
        for (ProductOrder order : orders) {
            total += order.price * order.quantity;
        }
        return total;
    }

}

/*
정리

대원칙 : 자바는 항상 변수의 값을 복사해서 대입한다.
기본형, 참조형 모두 항상 변수에 있는 값을 복사해서 대입한다.
기본형 - 변수에 들어있는 실제 사용하는 값을 복사해서 대입하고
참조형 - 변수에 들어있는 참조값을 복사해서 대입
기본형이든 참조형이든 변수의 값을 대입하는 방식은 같으나, 동작하는 방식이 달라진다

1. 기본
기본형을 제외한 나머지 변수는 모두 참조형, 클래스와 배열을 다루는 변수는 참조형.
기본형 변수는 값을 저장, 참조형 변수는 참조(주소)를 저장
기본형 변수는 산술연산 수행가능, 참조형 변수는 불가
기본형 변수는 null 할당 불가, 참조형은 가능

2. 대입
기본형과 참조형 모두 대입시 변수 안에 있는 값을 읽고 복사해서 전달
기본형은 사용하는 값을 복사해서 전달, 참조형은 참조값을 복사해서 전달. 따라서 하나의 인스턴스를 여러곳에서 참조 가능

3. 메서드 호출
기본형 - 메서드 내부에서 매개변수의 값을 변경해도 호출자의 변수 값에는 영향 x
참조형 - 메서드 내부에서 매개변수로 전달된 객체의 멤버 변수를 변경시, 호출자의 객체도 변경된다.
 */