package HungryStudent;

class Student {

    private String name;
    private int studentId;
    private double walletBalance;
    private int hungerLevel;

    Student(String name, int studentId, double walletBalance, int hungerLevel) {
        this.name = name;
        this.studentId = studentId;
        this.walletBalance = walletBalance;
        this.hungerLevel = hungerLevel;
    }

    public void addMoney(double amount) {
        walletBalance += amount;
    }

    public void showBalance() {
        System.out.println("Wallet Balance: Rs." + walletBalance);
    }

    public void orderFood(FoodOrder order) {

        if (hungerLevel > 80) {
            System.out.println("EMERGENCY! Feed the student immediately!");
        }

        double total = order.calculateTotal();

        if (total > walletBalance) {
            System.out.println("Insufficient wallet balance!");
        } else {
            walletBalance -= total;
            System.out.println("Order placed successfully!");
        }
    }

    public String getName() {
        return name;
    }
}
