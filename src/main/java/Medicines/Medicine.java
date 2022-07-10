package Medicines;

import java.io.PrintStream;

public class Medicine {
    public PrintStream out;
    private String name;
    private Presentation presentation;
    private String usage;
    private String quantity;
    private int stock;
    private int price;

    public Medicine( String name,Presentation presentation,String usage, String quantity,int stock, int price) {
        this.usage = usage;
        this.name = name;
        this.presentation = presentation;
        this.quantity = quantity;
        this.stock = stock;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getStock() {
        return this.stock;
    }

    public Presentation getPresentation() {
        return this.presentation;
    }

    public void reduceStock() {
        this.stock--;
    }

    public int getPrice() {
        return this.price;
    }

    public String getQuantity() {
        return this.quantity;
    }
}
