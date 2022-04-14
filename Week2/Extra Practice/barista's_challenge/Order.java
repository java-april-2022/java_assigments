import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items = new ArrayList<Item>();
    
    // CONSTRUCTOR
    public Order(){
        this.name = "guest";
        this.ready= false;
    }
    
    // OVERLOADED CONSTRUCTOR
    public Order(String name){
        this.name = name;
        this.ready = false;
    }
    
    // GETTERS & SETTERS
    
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean getReady(){
        return this.ready;
    }

    public void setReady(boolean ready){
        this.ready = ready;
    }

    public ArrayList<Item> getItems(){
        return items;
    }

    public void getItems( ArrayList<Item> items){
        this.items = items;
    }

    //Order Methods

    public void addItem(Item item){
        this.items.add(item);
    }

    public String getStatusMessage(){
        if (this.ready == true){
            return ("Your Order is Ready.");
        }else{
            return ("Thank you for waiting, Your order will be ready soon.");
        }
    }

    public double getOrderTotal(){
        double total = 0;
        for (Item i: this.items){
            total += i.getPrice();
        }
        return total;
    }

    public void display(){
        System.out.printf("Customer's Name: %s", this.name);
        for (Item i:this.items){
            System.out.printf(i.getName() + "-$" +i.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }
}

