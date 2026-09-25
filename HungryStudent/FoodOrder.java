package HungryStudent;

class FoodOrder {

    private int orderId;
    private String foodName;
    private double price;
    private int quantity;

    FoodOrder(int orderId, String foodName, double price, int quantity) {
        this.orderId = orderId;
        this.foodName = foodName;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateTotal() {

        if (foodName.equals("Biryani")) {
            System.out.println("Student has chosen happiness");
        }

        if (quantity > 3) {
            System.out.println("Bro, are you feeding the entire class?");
        }

        return price * quantity;
    }

    public void showOrder() {
        System.out.println("Food: " + foodName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: Rs." + calculateTotal());
    }
}
