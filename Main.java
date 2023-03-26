import java.util.ArrayList;
import java.util.Scanner;

class Inventory {
    private String name;
    private String serialNumber;
    private int price;
    
    public Inventory(String name, String serialNumber, int price) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSerialNumber() {
        return serialNumber;
    }
    
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
}

class Main {

	public static void main(String[] args) {
    ArrayList<Inventory> ivent = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    int User=0;    

    while(!(User == 5)){
        System.out.println("Press 1 to add an item.");
        System.out.println("Press 2 to delete an item.");
        System.out.println("Press 3 to update an item.");
        System.out.println("Press 4 to show all of the items.");
        System.out.println("Press 5 to quit the program.");
        User = input.nextInt();
        if(User == 1){
            input.nextLine();
            System.out.println("Enter the name:");
            String name = input.nextLine();
            System.out.println("Enter the serial number:");
            String serialNumber = input.nextLine();
            System.out.println("Enter the value in dollars (whole number):");
            int price = input.nextInt();
            Inventory item = new Inventory(name, serialNumber, price);
            ivent.add(item);
        }
        else if(User == 2){
            input.nextLine();
            System.out.println("Enter the serial number of the item you want to delete:");
            String serialNumber = input.nextLine();
            for (int i = 0; i < ivent.size(); i++) {
                if (ivent.get(i).getSerialNumber().equals(serialNumber)) {
                    ivent.remove(i);
                    break;
                }
            }
        }
        else if(User == 3){
            input.nextLine();
            System.out.println("Enter the serial number of the item to change:");
            String serialNumber = input.nextLine();
            for (int i = 0; i < ivent.size(); i++) {
                if (ivent.get(i).getSerialNumber().equals(serialNumber)) {
                    System.out.println("Enter the new name:");
                    String name = input.nextLine();
                    System.out.println("Enter the new value in dollars (whole number):");
                    int price = input.nextInt();
                    ivent.get(i).setName(name);
                    ivent.get(i).setPrice(price);
                    break;
                }
            }
        }
        else if(User == 4){
            for (Inventory item : ivent) {
         System.out.println(item.getName() + "," + item.getSerialNumber() + "," +                     item.getPrice());
}

        }
    }      
 }
}