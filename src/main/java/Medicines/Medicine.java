package Medicines;

public class Medicine {
    private String name;
    private Presentation presentation;
    private String usage;
    private String quantity;
    private int stock;

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

    public void reduceStock() {
        this.stock--;
    }
}
