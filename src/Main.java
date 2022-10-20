public class Main {
    public static void main(String[] args) {
        //int[] sales = {10, 20, 30, 40, 50, 60};
        long[] sales= {10, 20, 30, 40, 50, 60};
        SalesManager manager = new SalesManager(sales);
       // System.out.println("Максимальная сумма " + manager.max());
        //System.out.println("Минимальная сумма " + manager.min());
        System.out.println("Средняя сумма " + manager.croppedMiddle());
    }
}
