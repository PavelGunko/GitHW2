public class Main {
    public static void main(String[] args) {
        int[] sales= {10, 20, 30};
        SalesManager manager = new SalesManager(sales);
        System.out.println(manager.max());
    }
}

public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
}
