package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder order1 = createOrder("두부",2000,2);
        ProductOrder order2 = createOrder("김치",5000,1);
        ProductOrder order3 =  createOrder("콜라",1500,2);

        ProductOrder[] Orders = {order1,order2,order3};

        /*
        ProductOrder[] Orders = new ProductOrder[3];
        Orders[0] = createOrder("두부",2000,2);
        Orders[1] = createOrder("김치",5000,1);
        Orders[2] =  createOrder("콜라",1500,2);
        빈 배열을 만들고, 그 자리에 바로 넣는게 깔끔하다
         */

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
