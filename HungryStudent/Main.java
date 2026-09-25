package HungryStudent;

public class Main {

    public static void main(String[] args) {

        Student s = new Student("Hemanth", 101, 1000, 90);

        FoodOrder order = new FoodOrder(
            1,
            "Biryani",
            150,
            2
        );

        System.out.println("Student: " + s.getName());

        order.showOrder();

        s.orderFood(order);

        double total = order.calculateTotal();

        Payment payment = new UPI();
        payment.pay(total);

        Delivery delivery = new BikeDelivery();
        delivery.deliver();

        s.showBalance();
    }
}
