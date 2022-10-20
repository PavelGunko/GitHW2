public class Main {
    public static void main(String[] args) {
        int[] sales= {10, 20, 30};
        SalesManager manager = new SalesManager(sales);
        System.out.println(manager.max());
    }
}
