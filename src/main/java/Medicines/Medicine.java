package Medicines;

public class Medicine {
    protected String name;
    protected Presentation presentation;
    protected String usage;
    protected String quantity;
    protected int stock;

    public Medicine( String name,Presentation presentation,String usage,String quantity,int stock) {
        this.usage = usage;
        this.name = name;
        this.presentation = presentation;
        this.quantity = quantity;
        this.stock = stock;
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
}
