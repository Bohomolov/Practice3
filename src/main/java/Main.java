import books.Book;
import books.ComparatorBooks;
import houses.ComparatorHouse;
import houses.House;
import products.Product;
import students.Student;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Student> arrayStudent = new TreeSet<>();
        arrayStudent.add(new Student(5, "DDD", "Col", "RRR", "11.03.1995", "klllkk", "09555663321", "lkkk", 4, "45-PP"));
        arrayStudent.add(new Student(2, "PPP", "III", "NNN", "25.09.2000", "uuju", "06688656565", "PHT", 3, "32-PH"));
        arrayStudent.add(new Student(3, "QQQQQQ", "HHHYYYY", "LLLLL", "30.01.2001", "Pkkkk kkk kkooo", "8056866552", "TTS", 2, "45-OO"));
        arrayStudent.add(new Student(1, "UUUUU", "BBBBB", "EEEE", "15.04.1996", "OOOOOooo", "6369855551", "XCY", 5, "51-XY"));
        arrayStudent.add(new Student(4, "MOIII", "LLOOPP", "POOII", "11.09.1995", ",lplplplp", "8888999988", "lkkk", 6, "61-PP"));
        for (Student s : arrayStudent) {
            System.out.println(s);
        }
        System.out.println();
        Set<Product> productSet = new TreeSet<>();
        productSet.add(new Product(5, "Phone XY", "POZ", 1200, "3 year", 1));
        productSet.add(new Product(3, "Bread", "OOZ", 5.5, "7 days", 5));
        productSet.add(new Product(2, "Laptop", "RRR", 2700, "5 years", 2));
        productSet.add(new Product(4, "Tea", "EST", 17.8, "1 years", 20));
        productSet.add(new Product(1, "Bear", "BOR", 20, "2 months", 3));
        for (Product p : productSet) {
            System.out.println(p);
        }
        System.out.println();
        ComparatorHouse comparatorHouse = new ComparatorHouse();
        Set<House> houses = new TreeSet<>(comparatorHouse);
        houses.add(new House(1, 22, 55.5, 3, 2, "Hill Street 2l", "Kharkov", "5 years"));
        houses.add(new House(2, 66, 100, 1, 3, "LLLkkkk", "Rome", "1 years"));
        houses.add(new House(3, 122, 40.8, 5, 1, "TTTTttt st", "London", "2 years"));
        houses.add(new House(5, 252, 160.5, 13, 3, "Poiidd pr", "LA", "3 month"));
        houses.add(new House(4, 1, 200, 33, 4, "iiioommm sq", "Tokio", "15 years"));
        for (House h : houses) {
            System.out.println(h);
        }
        System.out.println();
        ComparatorBooks comparatorBooks = new ComparatorBooks();
        Set<Book> books = new TreeSet<>(comparatorBooks);
        books.add(new Book(1,"name1","Author 1 and Author 2","OOPO",1888,500,1500));
        books.add(new Book(2,"name2","Author","ZZZ",2000,205,750));
        books.add(new Book(3,"name3","Author 3 and Author 2","PSO",2001,75,359));
        books.add(new Book(4,"name4","Author 1 and Author 4","SOP",1995,300,1090));
        books.add(new Book(5,"name5","Author 4 and Author 3","FOP",2020,120,405));
        for (Book b:books) {
            System.out.println(b);
        }
    }

}
