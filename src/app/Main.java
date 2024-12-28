package app;

public class Main {
    public static void main(String[] args) {
        // Змінні для продукту 1
        String productName = "smartphone";
        int quantity = 50; // Кількість одиниць
        double price = 243.07; // Ціна за одиницю
        int days = 5; // Кількість днів

        // Розрахунок для продукту 1
        double totalSales = quantity * price;
        double dailySales = totalSales / days;

        // Виведення продукту 1
        System.out.printf("Product No 1: %s,%ntotal sales for %d days is EUR %.2f,%nsales by day is EUR %.2f.%n%n",
                productName, days, totalSales, dailySales);

        // Змінні для продукту 2
        productName = "laptop";
        quantity = 35; // Кількість одиниць
        price = 299.62; // Ціна за одиницю
        days = 7; // Кількість днів

        // Розрахунок для продукту 2
        totalSales = quantity * price;
        dailySales = totalSales / days;

        // Виведення продукту 2
        System.out.printf("Product No 2: %s,%ntotal sales for %d days is EUR %.2f,%nsales by day is EUR %.2f.%n",
                productName, days, totalSales, dailySales);
    }
}
