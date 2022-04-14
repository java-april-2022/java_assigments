import java.util.ArrayList;
public class Order {
    //Memeber Variables
    public String name; //default values is null
    public double total; // defaul value is 0
    public boolean ready; // default value is false

    // default if not assigned
    public ArrayList<Item> item = new ArrayList<Item>();
}
