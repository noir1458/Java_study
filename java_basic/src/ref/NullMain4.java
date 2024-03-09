package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        //NullPointerException
        //참조형의 초기값은 null
        //bigData.data 는 null
        System.out.println("bigData.data.value" + bigData.data.value);
    }
}
