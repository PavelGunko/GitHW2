public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
}


public class Main {
    public static void main(String[] args) {
        long[] sales = {10, 20, 30};
        SalesManager manager = new SalesManager(sales);
        System.out.println(manager.max());
    }
}
