import java.io.*;

class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

public class ProductSerialization {
    public static void main(String[] args) {
        Product p = new Product(101, "Laptop", 65000);

        try (
            ObjectOutputStream out =
                    new ObjectOutputStream(new FileOutputStream("product.ser"))
        ) {
            out.writeObject(p);
            System.out.println("Object Serialized");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (
            ObjectInputStream in =
                    new ObjectInputStream(new FileInputStream("product.ser"))
        ) {
            Product obj = (Product) in.readObject();

            System.out.println("\nDeserialized Object:");
            obj.display();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}