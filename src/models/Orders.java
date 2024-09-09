package models;

import java.util.ArrayList;
import java.util.List;

public class Orders {
    Customers customers;
    ArrayList<BookOrders> bookOrders;

    public Orders(Customers customers, ArrayList<BookOrders> bookOrders) {
        this.customers = customers;
        this.bookOrders = bookOrders;
    }

    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    public ArrayList<BookOrders> getBookOrders() {
        return bookOrders;
    }

    public void setBookOrders(ArrayList<BookOrders> bookOrders) {
        this.bookOrders = bookOrders;
    }
}
