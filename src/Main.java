import models.Book;
import models.BookOrders;
import models.Customers;
import models.Genra;
import models.Orders;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Genra g1 = new Genra("fiction", "It is good");
        Genra g2 = new Genra("fantasy", "It is good");
        Genra g3 = new Genra("history", "It is good");
        Genra g4 = new Genra("bad", "It is not good");

        Book b1 = new Book("Flying Cats with Tails", "Arnold Stine", g1, "good", 600);
        Book b2 = new Book("Flying Rabbits with Tails", "Arnold Stine the Second", g1, "vvgood", 6012);
        Book b3 = new Book("Flying Dogs with Tails", "Arnold Stine the Third", g1, "vvvgood", 62938);

        List<Book> onsale = new ArrayList<>();
        onsale.add(b1);
        onsale.add(b2);
        onsale.add(b3);

        List<BookOrders> bookorders = new ArrayList<>();

        System.out.println("Do you want to order books? Write true or false");
        boolean orderBooks = sc.nextBoolean();

        if (orderBooks) {
            System.out.println("Books on sale are: ");
            for (int i = 0; i < onsale.size(); i++) {
                Book book = onsale.get(i);
                System.out.println("No" + (i + 1) + " " + book.getBookDetails());
            }

            System.out.println("To get details press 1 else press 2");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println(b1.getBookDetails());
                System.out.println();
                System.out.println(b2.getBookDetails());
                System.out.println();
                System.out.println(b3.getBookDetails());
                System.out.println();
            }

            System.out.println("Please enter customer id(Name): ");
            int id = sc.nextInt();
            System.out.println("Please enter customer Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Please enter customer Address: ");
            String address = sc.nextLine();
            System.out.println("Please enter customer phone number: ");
            String phone = sc.next();
            System.out.println("Please enter customer email: ");
            String email = sc.next();

            Customers customer = new Customers(id, name, address, email, phone);

            boolean ordering = true;
            while (ordering) {
                System.out.println("Which book do you want to order? Press its number");
                int whichBook = sc.nextInt();
                System.out.println("How many do you want to order?");
                int howMany = sc.nextInt();

                if (whichBook == 1) {
                    BookOrders bo1 = new BookOrders(1, b1, howMany);
                    bookorders.add(bo1);
                } else if (whichBook == 2) {
                    BookOrders bo2 = new BookOrders(2, b2, howMany);
                    bookorders.add(bo2);
                } else if (whichBook == 3) {
                    BookOrders bo3 = new BookOrders(3, b3, howMany);
                    bookorders.add(bo3);
                } else {
                    System.out.println("Enter a valid book number");
                }

                System.out.println("Do you want to order another book? Write true or false");
                ordering = sc.nextBoolean();
            }

            Orders order = new Orders(customer, new ArrayList<>(bookorders));


            System.out.println("Order Summary:");
            System.out.println(order.getCustomers());
            for (BookOrders bo : order.getBookOrders()) {
                System.out.println(bo.getBook().getBookDetails() + " - Quantity: " + bo.getQuantity());
            }
        }
    }
}
