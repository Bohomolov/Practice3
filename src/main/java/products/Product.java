package products;

import java.util.Objects;

public class Product implements Comparable<Product>{
    private final int id;
    private String name;
    private String manufacturer;
    private double price;
    private String storagePeriod;
    private int amount;

    public Product(int id, String name, String manufacturer, double price, String storagePeriod, int amount) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.storagePeriod = storagePeriod;
        this.amount = amount;
    }

    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", storagePeriod='" + storagePeriod + '\'' +
                ", amount=" + amount + '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id &&
                Double.compare(product.price, price) == 0 &&
                amount == product.amount &&
                Objects.equals(name, product.name) &&
                Objects.equals(manufacturer, product.manufacturer) &&
                Objects.equals(storagePeriod, product.storagePeriod);
    }

    public int hashCode() {
        return Objects.hash(id, name, manufacturer, price, storagePeriod, amount);
    }

    public int compareTo(Product o) {
        return (int) (this.price - o.price);
    }
}
