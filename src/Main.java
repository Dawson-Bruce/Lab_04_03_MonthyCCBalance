public class Main {
    public static void main(String[] args) {
        double initialBalance = 5000;
        System.out.println("Initial credit card balance: $" + initialBalance);

        double firstMonthBalance = initialBalance * 1.17;
        System.out.println("Credit card balance after 1 month: $" + firstMonthBalance);

        double secondMonthBalance = firstMonthBalance * 1.17;
        System.out.println("Credit card balance after 2 months: $" + secondMonthBalance);
    }
}