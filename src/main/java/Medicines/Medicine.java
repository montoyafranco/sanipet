package Medicines;

public class Medicine {
    protected String name;
    protected Presentation presentation;
    protected String usage;
    protected int quantity;
    protected int stock;

    public Medicine( String name,Presentation presentation,String usage,int quantity,int stock) {
        this.usage = usage;
        this.name = name;
        this.presentation = presentation;
        this.quantity = quantity;
        this.stock = stock;
    }


}
