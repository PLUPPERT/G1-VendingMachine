package se.lexicon.data;

import se.lexicon.model.Product;

public interface IVendingMachine {
    void addCurrency(double amount);
    int getBalance();
    Product request(int id);
    int endSession();
    String getDescription(int id);
    String[] getProducts();
}
